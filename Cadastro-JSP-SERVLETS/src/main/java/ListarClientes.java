import com.sun.management.UnixOperatingSystemMXBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Cliente;
import model.ServicoCliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebServlet(value = "/exemplo2")
public class ListarClientes extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        List<Cliente> clientes = (List<Cliente>) session.getAttribute("clientes");
        req.setAttribute("clientes", clientes);
        req.getRequestDispatcher("/aba1ListaCliente.jsp").forward(req, resp);


    }
}

