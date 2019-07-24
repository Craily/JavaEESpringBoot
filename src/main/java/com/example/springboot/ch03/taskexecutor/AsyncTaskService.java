package com.example.springboot.ch03.taskexecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	
	private Logger log = LoggerFactory.getLogger(AsyncTaskService.class);

	/**
	 * 通过@Async注解表明该方法是个异步方法，
	 * 如果注解在类级别，
	 * 则表明该类所有的方法都是异步方法，
	 * 而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
	 */

	@Async
	public void executeAsyncTask(Integer i) {
		log.debug("执行异步任务：" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		log.debug("执行异步任务+1：" + (i + 1));
	}
}
