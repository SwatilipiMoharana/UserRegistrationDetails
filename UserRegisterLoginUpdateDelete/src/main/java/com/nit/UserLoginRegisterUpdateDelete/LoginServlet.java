package com.nit.UserLoginRegisterUpdateDelete;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet  extends HttpServlet {
	public void  doPost(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException {
		
		UserBean ub=new LoginDao().login(req);
		PrintWriter pw=res.getWriter();
		if(ub!=null) {
			pw.println("login successful...");
		}
		else {
			pw.println("login is not successful...");
		}
	}


}
