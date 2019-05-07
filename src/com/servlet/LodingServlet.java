package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mchange.v2.c3p0.ComboPooledDataSource;
public class LodingServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;
		PreparedStatement pt=null;
		ResultSet rt =null;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			con = cpds.getConnection();
			String sql="select * from user where username=? and password=?";
			 pt = con.prepareStatement(sql);
			 pt.setString(1, username);
			 pt.setString(2, password); 
			 rt = pt.executeQuery();
			 if(rt.next()){ 
					request.getRequestDispatcher("success.jsp").forward(request, response);
			 }
			 else{
						request.getRequestDispatcher("error.jsp").forward(request, response);
					}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
