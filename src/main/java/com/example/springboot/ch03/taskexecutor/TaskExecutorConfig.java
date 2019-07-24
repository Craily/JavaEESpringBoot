package com.example.springboot.ch03.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.example.springboot.ch03.taskexecutor")
@EnableAsync//开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

	@Override
	public Executor getAsyncExecutor() {
		// TODO 处理异步方法调用时需要使用的实例
		/**
		 * 配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，
		 * 并返回一个ThreadPoolTaskExecutor，
		 * 这样就获得了一个基于线程池TaskExecutor
		 */
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO 在使用void返回类型的异步方法执行期间抛出异常时要使用的实例
		return new SimpleAsyncUncaughtExceptionHandler();
	}

}
