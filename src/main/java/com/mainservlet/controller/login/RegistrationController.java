package com.mainservlet.controller.login;

import com.mainservlet.model.UserAddSystem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher rd = null;
        rd = req.getRequestDispatcher("WEB-INF/view/registration.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = null;
        if(req.getParameter("save")!= null){
            String user = req.getParameter("userName");
            String password = req.getParameter("password");
            String email= req.getParameter("email");

            UserAddSystem userNew = new UserAddSystem(user, password, email);


            if(userNew.readyForBuild(userNew)){
                req.setAttribute("userNewName1", userNew.getUserName());
                req.setAttribute("userNewPass1", userNew.getPassword());
                req.setAttribute("userNewEmail1", userNew.getEmail());

                rd = req.getRequestDispatcher("WEB-INF/view/registrationOK.jsp");

            }
            else rd = req.getRequestDispatcher("WEB-INF/view/errorRegistration.jsp");
        }else if(req.getParameter("cancel")!=null){
            rd = req.getRequestDispatcher("WEB-INF/view/login.jsp");
        }
        else if(req.getParameter("startPage") != null){
            rd = req.getRequestDispatcher("WEB-INF/view/startPage.jsp");
        }
        rd.forward(req, resp);
    }
}
