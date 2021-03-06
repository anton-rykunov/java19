package controllers;

import database.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DisciplineCreatController", urlPatterns = "/dis-creat")
public class DisciplineCreatController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
req.getRequestDispatcher("WEB-INF/jsp/disciplines-creat.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String disc = req.getParameter("newDisc");
       if(disc == null || disc.equals("")){
           req.setAttribute("message", "error");
           req.getRequestDispatcher("WEB-INF/jsp/disciplines-creat.jsp").forward(req, resp);
           return;
       }
        DBManager.creatNewDiscipline(disc);
        resp.sendRedirect("/disciplines");
    }
}
