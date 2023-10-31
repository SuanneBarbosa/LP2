package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;
@WebServlet(value = "/LogOrganizador")
public class LoginOrganizadorServlets extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        if ("organizador@gmail.com".equals(email) && "123".equals(senha)) {
            resp.sendRedirect("cadAtividades.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }


    }
}


