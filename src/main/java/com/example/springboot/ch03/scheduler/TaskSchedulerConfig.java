package com.example.springboot.ch03.scheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.example.springboot.ch03.scheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
