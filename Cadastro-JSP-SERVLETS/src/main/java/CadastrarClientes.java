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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@WebServlet("/exemplo1") //acessar a Servlet
public class CadastrarClientes extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter Writer = resp.getWriter(); //Método que retorna um objeto para escrever a resposta:

        String nome = req.getParameter("nome");

        String dataNascimento = req.getParameter("dataNascimento");


        String cpf = req.getParameter("cpf");

        String telefone = req.getParameter("telefone");


       resp.sendRedirect("aba2FormularioCadastro.jsp");
        List<Cliente> clientes = new ArrayList<>();
         // Objeto Cliente com os dados recebidos
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setDataNascimento( dataNascimento);
        //sessão
        HttpSession session = req.getSession();
        clientes = (List<Cliente>) session.getAttribute("clientes");

      if (clientes == null){
          clientes = new ArrayList<>();

      }

        clientes.add(cliente);
        session.setAttribute("clientes", clientes);
        System.out.println(clientes);
        resp.sendRedirect(req.getContextPath() + "/aba1ListaCliente.jsp");



    }
}
