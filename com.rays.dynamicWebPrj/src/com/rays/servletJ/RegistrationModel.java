package com.rays.servletJ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;


public class RegistrationModel {

public String add(RegistrationBean bean) throws Exception {
			String status;
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO registerform VALUES(?,?,?,?,?,?,?)");
		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getGender());
		ps.setString(4, bean.getDob());
		ps.setString(5, bean.getAdd());
		ps.setString(6, bean.getEmail());
		ps.setString(7, bean.getPwd());
		
		
		int i = ps.executeUpdate();
		ps.close();
		conn.close();
		
		if(i==1) {
			status="success";
		}else {
			status="fail";
		}
		return status;
		
		
		 
	}

	 
}
