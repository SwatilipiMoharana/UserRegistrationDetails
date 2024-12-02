package com.nit.UserLoginRegisterUpdateDelete;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

public void  doPost(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException {
		
		UserBean ub=new UserBean();
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ub.setUserName(req.getParameter("uname"));
		ub.setPassword(req.getParameter("pword"));
		ub.setUFName(req.getParameter("ufname"));
		ub.setULName(req.getParameter("ulname"));
		ub.setUAddress(req.getParameter("uaddress"));
		ub.setUMailid(req.getParameter("umailid"));
		ub.setUPhno(Long.parseLong(req.getParameter("uphno")));
int k= new registerDao().register(ub);
if(k>0) {
	pw.println(" Registration successful...");
	req.getRequestDispatcher("Login.html").include(req, res);
}
else {
	pw.println("registration failed...");
	req.getRequestDispatcher("Register.html").include(req, res);
}
}
}
