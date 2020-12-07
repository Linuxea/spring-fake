package chapter2.client;

import chapter2.controller.PersonController;
import chapter2.util.BeanFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author linuxea
 */
@WebServlet(urlPatterns = "/demo1")
public class ClientServlet extends HttpServlet {

    private final PersonController personController = (PersonController) BeanFactory.getBean("chapter2/controller/PersonController");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(personController.getPerson().toString());
    }
}
