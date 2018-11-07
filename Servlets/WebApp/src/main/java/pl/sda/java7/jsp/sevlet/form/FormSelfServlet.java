package pl.sda.java7.jsp.sevlet.form;

import pl.sda.java7.jsp.Html;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author michaljedryszka
 */
@WebServlet(
        name = "formself",
        urlPatterns = {"/formself"}
)
public class FormSelfServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        Html page = Html.page();
        page.tag("p").write("Przykladowy formularz GET submitujacy do siebie").end();
        page.tag("form", "action", "", "method", "GET");
        page.tag("input", "name", "nazwa_pola", "value", "warsoc pola").end();
        page.tag("input", "type", "submit", "value", "wyslij").end();
        page.end();

        final Enumeration<String> parameternames = req.getParameterNames();
        while(parameternames.hasMoreElements()){
            final String parameterName = parameternames.nextElement();
            page.tag("p").write("parametr: ").write( parameterName).write("; wartosc: ").write(req.getParameterValues(parameterName)[0]).end();
        }
        resp.getWriter().write(page.render());
    }
}
