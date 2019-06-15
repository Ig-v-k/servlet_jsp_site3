package controller.servlets;

import db_utils.DBUtils;

import javax.ejb.Init;
import javax.naming.InitialContext;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class StudentServlet extends HttpServlet implements Servlet {
    private Integer i = 0;
    private static Connection conn;
    private static PreparedStatement ps;
    private static DataSource ds;
    private static Logger log = Logger.getLogger(String.valueOf(StudentServlet.class));
    static{

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/students.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
