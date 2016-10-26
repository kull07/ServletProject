package com.mainservlet.controller;

import com.mainservlet.model.UserSystem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUser extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = null;
        if(req.getParameter("save")!= null){
            String user = req.getParameter("user");
            String password = req.getParameter("password");
            String email= req.getParameter("email");
            String address= req.getParameter("address");
            String phone= req.getParameter("phone");
            UserSystem userNew = new UserSystem();
            userNew.setUser(user);
            userNew.setPassword(password);
            userNew.setEmail(email);
            userNew.setAddress(address);
            userNew.setPhone(phone);
            if(userNew.createdOK(userNew)){
                req.setAttribute("userNewName1", userNew.getUser());
                req.setAttribute("userNewPass1", userNew.getPassword());
                req.setAttribute("userNewEmail1", userNew.getEmail());
                req.setAttribute("userNewAddress1", userNew.getAddress());
                req.setAttribute("userNewPhone1", userNew.getPhone());
                rd = req.getRequestDispatcher("WEB-INF/view/registrationOK.jsp");

            }
            else rd = req.getRequestDispatcher("WEB-INF/view/errorRegistration.jsp");
        }else if(req.getParameter("cancel")!=null){
            rd = req.getRequestDispatcher("WEB-INF/view/login.jsp");
        }
        rd.forward(req, resp);
    }
}
