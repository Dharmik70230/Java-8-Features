package com.phoenix.interfaces.functional;

public class Message {

	private String msg;
	public Message() {
		// TODO Auto-generated constructor stub
		System.out.println("Default");
	}
	public Message(String msg) {
		super();
		this.msg = msg;
		System.out.println("Param");
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
