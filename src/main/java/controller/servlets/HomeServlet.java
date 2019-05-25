package controller.servlets;

import controller.dao.CourseImplDao;
import controller.dao.ImplCourseDao;
import controller.dao.ImplStudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "home_servlet",
            urlPatterns = "/homeServlet.a.b.c")
public class HomeServlet extends HttpServlet {

    private CourseImplDao courseImplDao = CourseImplDao.getInstance();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
    }


}
