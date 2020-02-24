package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// means that it's a spring config file
@Configuration
// means that spring will scan all classes in "com.luv2code.springdemo" and will look for annotations in them 
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

}
