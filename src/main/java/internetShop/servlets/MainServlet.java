package internetShop.servlets;

import internetShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] products = new String[]{"cwe", "dvew", "evwewv"};
        req.setAttribute("products", products);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
