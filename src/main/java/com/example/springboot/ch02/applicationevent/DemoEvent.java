package com.example.springboot.ch02.applicationevent;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7312917097886317274L;
	private String msg;

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
		System.out.println("DemoEvent接收到的信息：" + msg + "并处理完毕");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
