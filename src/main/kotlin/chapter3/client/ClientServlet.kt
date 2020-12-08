package chapter3.client

import chapter3.controller.PersonController
import chapter3.util.BeanFactory
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author linuxea
 */
@WebServlet(urlPatterns = ["/demo3"])
class ClientServlet : HttpServlet() {


    @Throws(ServletException::class, IOException::class)
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {

        (1..100)
            .map { BeanFactory.getBean("chapter3.controller.PersonController") as PersonController }
            .forEach { println(it) }
        resp.writer.write("完事了")
        resp.writer.flush()
    }
}