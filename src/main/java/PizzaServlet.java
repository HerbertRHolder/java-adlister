import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ParksServlet", urlPatterns = "/parks")
public class PizzaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //req.setAttribute("parks", parks);

        //String username = req.getParameter("username");
        //req.setAttribute("username", username);

        //req.getRequestDispatcher("/parks.jsp").forward(req, resp);

    }
}
