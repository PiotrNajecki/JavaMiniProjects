package pl.sda.java7.jsp.sevlet.form;

import pl.sda.java7.jsp.Html;

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
        name = "formget",
        urlPatterns = {"/formget"}
)
public class FormGetServlet extends HttpServlet {
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        Html page = Html.page();
        page.tag("p").write("Przykladowy formularz GET wygenerowany z servletu").end();
        page.tag("form", "action", "./formtarget", "method", "GET");
        page.tag("input", "name", "nazwa_pola", "value", "warsoc pola").end();
        page.tag("input", "type", "submit", "value", "wyslij").end();
        page.end();
        page.tag("a", "href", "./formtarget?a=b&c=d").write("odnosnik").end();
        resp.getWriter().write(page.render());
    }
}
