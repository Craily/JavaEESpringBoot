package com.example.springboot.ch02.applicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPulisher {

	@Autowired
	//注入applicationContext用来发布事件
	ApplicationContext applicationContext;
	
	public void pulish(String msg) {
		//使用applicationContext的publishEvent方法来发布
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
