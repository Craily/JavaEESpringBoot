package com.example.springboot.ch03.test;

public class TestBean {

	private String content;

	/**
	 * @param content
	 */
	public TestBean(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
