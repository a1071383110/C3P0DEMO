package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class RegistredServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		Connection con=null;
		PreparedStatement pt=null;
		int i;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tel = request.getParameter("tel");
        String email = request.getParameter("email");
        try {
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			con = cpds.getConnection();
			String sql="insert into user(username,password,tel,email) values(?,?,?,?)";
			 pt = con.prepareStatement(sql);
			 pt.setString(1, username);
			 pt.setString(2, password);  
			 pt.setString(3, tel); 
			 pt.setString(4, email); 
			i=pt.executeUpdate();
			 if(i!=0){
					request.getRequestDispatcher("Loding.jsp").forward(request, response);
			 }
			 else{
						request.getRequestDispatcher("error.jsp").forward(request, response);
					}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


