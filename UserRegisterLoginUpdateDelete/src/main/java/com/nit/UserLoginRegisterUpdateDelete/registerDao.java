package com.nit.UserLoginRegisterUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registerDao {
int k=0;
	public int register(UserBean ub) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","756059");
			PreparedStatement ps=con.prepareStatement("insert into UserRegisterLoginUpdateDelete values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getUserName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getUFName());
			ps.setString(4, ub.getULName());
			ps.setString(5, ub.getUAddress());
			ps.setString(6, ub.getUMailid());
			ps.setLong(7, ub.getUPhno());
			k=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
