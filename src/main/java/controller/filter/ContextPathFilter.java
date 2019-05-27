package controller.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter("/")
public class ContextPathFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String action = req.getServletPath();
        switch (action) {
            case "/home":
                req.getRequestDispatcher("home.jsp").forward(req, res);
                filterChain.doFilter(req, res);
                return;
            case "/courses":
                req.getRequestDispatcher("courses.jsp").forward(req, res);
                filterChain.doFilter(req, res);
                return;
        }

        req.getRequestDispatcher("home.jsp").forward(req, res);
        filterChain.doFilter(req, res);
        return;
    }

    @Override
    public void destroy() {

    }
}
