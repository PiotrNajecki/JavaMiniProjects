package pl.sda.java7.jsp.sevlet.session;

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
        name = "sessionstop",
        urlPatterns = {"/sessionstop"}
)
public class SessionInvalidateServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        Html page = Html.page();
        if(req.getSession(false) != null){
            page.tag("p").write("Sesja ustawiona, wartosc:").write(req.getSession().getAttribute("sessionstart").toString()).end();
            page.tag("p").write("Invaliduje").end();
            req.getSession().invalidate();
        }else{
            page.tag("p").write("Sesja nie ustawiona").end();
        }
        resp.getWriter().write(page.render());
    }
}
