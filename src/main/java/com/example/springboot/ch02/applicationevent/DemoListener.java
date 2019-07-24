package com.example.springboot.ch02.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
//实现ApplicationListener接口，并指定监听的事件类型
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	//使用onApplicationEvent方法对消息进行接受处理
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("DemoListener接收到DemoEvent发布的消息：" + msg);
	}

}
