package com.mainservlet.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher rd = null;
        rd = req.getRequestDispatcher("WEB-INF/view/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String nameUser = "roma";
        String pasUser = "111";
        RequestDispatcher rd = null;
        if(nameUser != null){
            if(nameUser.equals(req.getParameter("userName")) && pasUser.equals(req.getParameter("password"))){
                req.setAttribute("nameUser", req.getParameter("userName"));
                rd = req.getRequestDispatcher("WEB-INF/view/loginOK.jsp");
            }
            else if(!pasUser.equals(req.getParameter("password")) || !nameUser.equals(req.getParameter("userName"))) {
                rd = req.getRequestDispatcher("WEB-INF/view/registration.jsp");
            }
        }else {
                rd = req.getRequestDispatcher("WEB-INF/view/registration.jsp");
            }
            rd.forward(req, resp);
        }


}
