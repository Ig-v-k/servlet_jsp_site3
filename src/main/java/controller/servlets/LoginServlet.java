package controller.servlets;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet(
//        name = "login_servlet",
//        urlPatterns = "/login"
//)
public class LoginServlet extends HttpServlet implements Servlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(req.getParameter("logout") != null)
        {
            session.invalidate();
            resp.sendRedirect("students");
            return;
        }
        else if(session.getAttribute("username") != null)
        {
            resp.sendRedirect("students");
            return;
        }

        req.setAttribute("loginFailed", false);
        req.getRequestDispatcher("/WEB-INF/jsp/view/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
//        if(session.getAttribute("username") != null)
//        {
//            resp.sendRedirect("students");
//            return;
//        }

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals("") || password.equals(""))
        {
            req.setAttribute("loginFailed", true);
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        }
        else
        {
            session.setAttribute("username", username);
            req.changeSessionId();
            resp.sendRedirect("students.do");
        }
    }
}