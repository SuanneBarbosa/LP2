
import jakarta.servlet.RequestDispatcher;
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
import java.util.List;
@WebServlet(value = "/busca-cliente")
public class MostrarCliente extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Cliente> clientes = (List<Cliente>) session.getAttribute("clientes");
        String cpf = req.getParameter("cpf");
        Cliente cliente = ServicoCliente.buscarClientePorCpf(cpf, clientes);
        System.out.println(cliente+"----------------------------------");
        System.out.println(cliente);


        if (cliente != null && cliente.getCpf() != null && cliente.getCpf().equals(cpf)) {
            // exibir o cliente
            req.setAttribute("cliente", cliente);
            req.getRequestDispatcher("/aba3DetalheCliente.jsp").forward(req, resp);
        } else {
            // Cliente não encontrado ou CPF é nulo

        }
    }
}
