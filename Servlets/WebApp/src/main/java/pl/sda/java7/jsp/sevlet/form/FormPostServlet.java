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
        name = "formpost",
        urlPatterns = {"/formpost"}
)
public class FormPostServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        Html page = Html.page();
        page.tag("p").write("Przykladowy formularz POST wygenerowany z servletu").end();
        page.tag("form", "action", "./formtarget", "method", "POST");
        page.tag("input", "name", "nazwa_pola", "value", "warsoc pola").end();
        page.tag("input", "type", "submit", "value", "wyslij").end();
        page.end();
        resp.getWriter().write(page.render());
    }
}
