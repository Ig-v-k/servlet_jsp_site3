package controller.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "qwe")
public class qwe implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest w = (HttpServletRequest) req;
        HttpServletResponse ww = (HttpServletResponse) resp;
        HttpSession s = w.getSession();
        if(w.getParameter("username").equals("admin") && w.getParameter("password").equals("admin"))
        {
            s.setAttribute("asd", 1);
        }
        else
        {
            s.setAttribute("asd", 0);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
