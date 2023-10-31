package servlets;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        event.getServletContext().setAttribute("sessionFactory", sessionFactory);
    }

    public void contextDestroyed(ServletContextEvent event) {
        SessionFactory sessionFactory = (SessionFactory) event.getServletContext().getAttribute("sessionFactory");
        if (sessionFactory != null && !sessionFactory.isClosed()) {
            sessionFactory.close();
        }
    }

}
