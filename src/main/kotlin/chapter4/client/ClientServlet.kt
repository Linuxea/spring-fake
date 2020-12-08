package chapter4.client

import chapter4.controller.PersonController
import chapter4.util.BeanFactory
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author linuxea
 */
@WebServlet(urlPatterns = ["/demo4"])
class ClientServlet : HttpServlet() {


    @Throws(ServletException::class, IOException::class)
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {

        (1..10)
            .map { BeanFactory.getBean("personController") as PersonController }
            .forEach { println(it) }
        resp.writer.write("over")
        resp.writer.flush()
    }
}