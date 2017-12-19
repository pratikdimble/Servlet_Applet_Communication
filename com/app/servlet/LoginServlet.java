package com.app.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      PrintWriter out = response.getWriter();

      String uname = request.getParameter("uname");
         String upwd = request.getParameter("upwd");

      if(uname.equals("root") && upwd.equals("root")) {
          out.println("Login Success"); 
          }else {
        out.println("Login Failure");
      }
  }
}
