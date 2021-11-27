package com.rays.servletJ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AuthCTL")
public class AuthCTL extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			AuthModel model = new AuthModel();
			AuthBean bean = new AuthBean();
			bean.setEmail(request.getParameter("email"));
			bean.setPwd(request.getParameter("pwd"));
		
			AuthBean bean1=new AuthBean();
		bean1=	model.authC(bean.getEmail(), bean.getPwd());
		if(bean1!=null) {
			PrintWriter out = response.getWriter();
			out.println("Authentication Success");
		}else {
			
			PrintWriter out = response.getWriter();
			out.println("inavlid id and pwd");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}	}
	}
