package com.nit.UserLoginRegisterUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.http.HttpServletRequest;

public class LoginDao   {
	UserBean ub=null;
public UserBean  login( HttpServletRequest req ) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","756059");
       PreparedStatement ps=con.prepareStatement("update UserRegisterLoginUpdateDelete where UADDRESS=? and UNAME=?");	
	}
	catch(Exception e) {
		e.printStackTrace();
	}

 return ub;
}
}
