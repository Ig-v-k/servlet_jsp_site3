package controller.servlets;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet("/context")
public class ContextServlet extends HttpServlet implements Servlet {
    private static final long seriwalVersionUID = 102L;
    private ServletContext q = getServletContext();
    public ContextServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

        String action = request.getParameter("action");
        String contextPath = "/WEB-INF/views/";
        String page = null;
        String h = q.getInitParameter("zz");
//        if(h.equals("false")) {
//            page = "error.jsp";
//            contextPath += page;
//            request.getRequestDispatcher(contextPath).forward(request, response);
//        }
        if (action.equals("home")) {
            page = "home.jsp";
            contextPath += page;
        }
        else if (action.equals("courses")) {
            page = "courses.jsp";
            contextPath += page;
        }
        else if (action.equals("professors")) {
            page = "professors.jsp";
            contextPath += page;
        }
        else if (action.equals("students")) {
            page = "students.jsp";
            contextPath += page;
        }
        else if (action.equals("login")) {
            page = "login.jsp";
            contextPath += page;
        }
        else if (action.equals("logout")) {
            page = "logout.jsp";
            contextPath += page;
            request.setAttribute("user", "AAAA");
        }
/*        else {
            try {
                throw new Exception("QQQQQQQQQQQQQQQ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        request.getRequestDispatcher(contextPath).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
        this.doGet(request, response);
    }
}
