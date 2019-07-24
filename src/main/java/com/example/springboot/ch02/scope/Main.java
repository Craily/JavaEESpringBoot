package com.example.springboot.ch02.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService demoSingletonService = context.getBean(DemoSingletonService.class);
		DemoSingletonService singletonService = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService demoPrototypeService = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototypeService = context.getBean(DemoPrototypeService.class);
		
		System.out.println("demoSingletonService与singletonService是否相等" + demoSingletonService.equals(singletonService));
		System.out.println("demoPrototypeService与prototypeService是否相等" + demoPrototypeService.equals(prototypeService));

		context.close();
	}

}
