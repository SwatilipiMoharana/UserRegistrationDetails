package com.nit.UserLoginRegisterUpdateDelete;

import java.io.Serializable;

public class RegisterBean  implements Serializable{
private String UserName ,Password ,UFName,ULName,UAddress,UMailid;
private Long UPhno;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getUFName() {
	return UFName;
}
public void setUFName(String uFName) {
	UFName = uFName;
}
public String getULName() {
	return ULName;
}
public void setULName(String uLName) {
	ULName = uLName;
}
public String getUAddress() {
	return UAddress;
}
public void setUAddress(String uAddress) {
	UAddress = uAddress;
}
public String getUMailid() {
	return UMailid;
}
public void setUMailid(String uMailid) {
	UMailid = uMailid;
}
public Long getUPhno() {
	return UPhno;
}
public void setUPhno(Long uPhno) {
	UPhno = uPhno;
}
@Override
public String toString() {
	return "RegisterBean [UserName=" + UserName + ", Password=" + Password + ", UFName=" + UFName + ", ULName=" + ULName
			+ ", UAddress=" + UAddress + ", UMailid=" + UMailid + ", UPhno=" + UPhno + "]";
}


}
