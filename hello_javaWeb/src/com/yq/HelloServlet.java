package com.yq;

import com.google.gson.Gson;

import java.io.IOException;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doPost............");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Gson g=new Gson();
        response.getWriter().println(g.toJson(new User()));
        System.out.println("11111111111111");
    }
}
