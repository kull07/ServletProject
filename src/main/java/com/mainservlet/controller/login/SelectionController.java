package com.mainservlet.controller.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelectionController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher rd = null;
        rd = req.getRequestDispatcher("WEB-INF/view/startPage.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher rd = null;

        if(req.getParameter("oneEntrance") != null){
            rd = req.getRequestDispatcher("WEB-INF/view/polls.jsp");
        }
        else if(req.getParameter("alreadyRegistered") != null){
            rd = req.getRequestDispatcher("WEB-INF/view/login.jsp");
        }
        else if(req.getParameter("readyToRegister") != null){
            rd = req.getRequestDispatcher("WEB-INF/view/registration.jsp");
        }
        rd.forward(req, resp);
    }
}
