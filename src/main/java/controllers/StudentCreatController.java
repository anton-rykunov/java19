package controllers;

import database.DBManager;
import entity.Discipline;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

@WebServlet(name = "StudentCreatController", urlPatterns = "/student-creat")
public class StudentCreatController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/jsp/student-creat.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastname = req.getParameter("newLastname");
        String name = req.getParameter("newName");
        String date = req.getParameter("date");


        if(lastname.equals("") ||  name.equals("")){
            req.setAttribute("message", "error");
            req.getRequestDispatcher("WEB-INF/jsp/student-creat.jsp").forward(req, resp);
            return;
        }
        DBManager.creatNewStudent(lastname, name, date);
        resp.sendRedirect("/students");
    }
}
