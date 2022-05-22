package com.example.demochuyentiepservletsangjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DangNhap", urlPatterns = "/TTH")
public class DangNhap extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String u = request.getParameter("user");
            String p = request.getParameter("pass");
            RequestDispatcher requestDispatcher = null;


            PrintWriter printWriter = response.getWriter();
            if (u.equals("admin") && (p.equals("123"))) {
                requestDispatcher = request.getRequestDispatcher("boss.jsp");
                // requestDispatcher = request.getRequestDispatcher : để máy chủ tìm ra file boss.jsp và gán vào biến requesD

            } else {
                requestDispatcher = request.getRequestDispatcher("index.jsp");

            }
            requestDispatcher.forward(request,response);
            //forward : thực hiện thao tác hiển thị lên cho trình duyệt xem


        }
    }

