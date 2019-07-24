package com.example.springboot.ch01.configuration;

public class UseFunctionService {

	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
