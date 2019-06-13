package controller.servlets;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet("/context")
public class ContextServlet extends HttpServlet implements Servlet {
    private static final long seriwalVersionUID = 102L;

    public ContextServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

        String action = request.getParameter("action");
        String contextPath = "/WEB-INF/views/";
        String page = null;
        String a = null;
        if (action.equals("home")) {
            page = "home.jsp";
            a = contextPath + page;
            request.getRequestDispatcher(a).forward(request, response);
        }
        else if (action.equals("courses")) {
            page = "courses.jsp";
            a = contextPath + page;
            request.getRequestDispatcher(a).forward(request, response);
        }
        else if (action.equals("professors")) {
            page = "professors.jsp";
            a = contextPath + page;
            request.getRequestDispatcher(a).forward(request, response);
        }
        else if (action.equals("students")) {
            page = "students.jsp";
            a = contextPath + page;
            request.getRequestDispatcher(a).forward(request, response);
        }
        else if (action.equals("login")) {
            page = "login.jsp";
            a = contextPath + page;
            request.getRequestDispatcher(a).forward(request, response);
        }
        else if (action.equals("logout")) {
            page = "logout.jsp";
            request.setAttribute("user", "AAAA");
            a = contextPath + page;
            request.getRequestDispatcher(a).forward(request, response);
        }
/*        else {
            try {
                throw new Exception("QQQQQQQQQQQQQQQ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
        this.doGet(request, response);
    }
}
