package com.rays.servletJ;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationCTL")
public class RegistrationCTL extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			RegistrationModel model = new RegistrationModel();
			RegistrationBean bean = new RegistrationBean();
			bean.setFname(request.getParameter("fname"));
			bean.setLname(request.getParameter("lname"));
			bean.setGender(request.getParameter("gender"));
			bean.setDob(request.getParameter("dob"));
			bean.setAdd(request.getParameter("add"));
			bean.setEmail(request.getParameter("email"));
			bean.setPwd(request.getParameter("pwd"));
			String md = model.add(bean);
			PrintWriter out = response.getWriter();
			out.println(md);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
