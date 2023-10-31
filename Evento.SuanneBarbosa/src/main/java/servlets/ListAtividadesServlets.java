package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import model.Atividade2;
import org.hibernate.Session;
import util.HibernateUtil;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/ListAtividades")

public class ListAtividadesServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Atividade2> atividades = session.createQuery("FROM Atividade2", Atividade2.class).list();
        session.getTransaction().commit();
        session.close();
        req.setAttribute("atividades", atividades);
        req.getRequestDispatcher("listAtividades.jsp").forward(req, resp);
    }
    }
