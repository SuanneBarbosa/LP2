package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Atividade2;
import model.Participante;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.io.IOException;

@WebServlet(value = "/inscAtividade")
public class InscAtividadesServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome= req.getParameter("nome");
        int idAtividade = Integer.parseInt(req.getParameter("idAtividade"));

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Atividade2 atividade = session.get(Atividade2.class, idAtividade);

        if (atividade != null) {
            Participante participante = new Participante(nome);
            atividade.getParticipantes().add(participante);

            session.update(atividade);
            transaction.commit();
            session.close();
            resp.sendRedirect("listAtividades.jsp");
        } else {
            transaction.rollback();
            session.close();
            resp.sendRedirect("listAtividades.jsp");
        }

    }
}
