package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import model.Atividade2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(value = "/CadAtividade")

public class CadAtividadeServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String tipo = req.getParameter("tipo");
        String data = req.getParameter("data");
        String endereco = req.getParameter("endereco");
        String nomeOrganizador = req.getParameter("nomeOrganizador");

        Atividade2 atividade = new Atividade2(tipo, data, endereco, nomeOrganizador);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(atividade);

        transaction.commit();
        session.close();

        resp.sendRedirect("listAtividades.jsp");

    }}


