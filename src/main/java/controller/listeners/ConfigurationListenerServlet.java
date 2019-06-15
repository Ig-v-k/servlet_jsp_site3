package controller.listeners;

import controller.filter.AuthenticationFilter;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ConfigurationListenerServlet implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        ServletContext context = event.getServletContext();

        FilterRegistration.Dynamic registration = context.addFilter("authenticationFilter", new AuthenticationFilter());
        registration.setAsyncSupported(true);
        registration.addMappingForUrlPatterns(null, false, "/context", "/courses", "/students.jsp", "/login");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) { }
}
