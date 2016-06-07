package com.google.vskiev.mainpakage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vladislav savko on 07.06.16.
 */
public class MainServlet extends HttpServlet
{
 public MainServlet()
 {
     super();
 }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter p = resp.getWriter();
        p.print("hello from GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter p = resp.getWriter();
        p.print("hello from POST");


    }
}
