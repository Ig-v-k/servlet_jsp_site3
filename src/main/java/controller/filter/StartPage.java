//package controller.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class StartPage implements Filter {
//
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest w = (HttpServletRequest) req;
//        HttpServletResponse ww = (HttpServletResponse) resp;
//        if (w.getServletPath().equals("/start")) {
////            w.getRequestDispatcher("/context.do?action=home").forward(w, ww);
//            ww.sendRedirect("/context.do?action=home");
//            chain.doFilter(req, resp);
//        }
//        chain.doFilter(req, resp);
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//    }
//
//}
