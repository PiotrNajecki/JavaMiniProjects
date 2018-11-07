package pl.sda.java7.jsp.sevlet.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author michaljedryszka
 */
@WebServlet(
        name = "dodawanie",
        urlPatterns = {"/dodawanie"}
)
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final String[] argumenty = req.getParameterValues("argumenty");
        int wynik = Integer.valueOf(argumenty[0]).intValue() +
                Integer.valueOf(argumenty[1]).intValue();
        resp.getWriter().write(wynik + "");
    }
}
