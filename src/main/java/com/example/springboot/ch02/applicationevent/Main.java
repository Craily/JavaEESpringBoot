package com.example.springboot.ch02.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		/**
		 * ApplicationListener监听DemoEvent，当DemoEvent执行完毕后执行
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPulisher demoPulisher = context.getBean(DemoPulisher.class);
		demoPulisher.pulish("hello application event");
		context.close();
	}

}
