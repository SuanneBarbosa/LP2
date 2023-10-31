package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/PagInicio")
public class PaginaInicialServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tipoUsuario = req.getParameter("tipoUsuario");

        if ("participante".equals(tipoUsuario)) {
            resp.sendRedirect("inscAtividades.jsp");
        } else if ("organizador".equals(tipoUsuario)) {
            resp.sendRedirect("loginOrganizador.jsp");
        }
    }

}

