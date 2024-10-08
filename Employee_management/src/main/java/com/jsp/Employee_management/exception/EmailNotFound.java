package com.jsp.Employee_management.exception;

public class EmailNotFound extends RuntimeException {
 String msg="email not found";

public EmailNotFound(String String) {
	super();
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}
 
 }
