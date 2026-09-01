package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		var context= SpringApplication.run(BeanLifeCycleApplication.class, args);
		var greet = context.getBean(greet.class);
		greet.greet();
	}

}

/**
 * 
 * ==================>>>>Bean Life Cycle<<<<================
 * 1.Bean Instantiated- Object is created
 * 2.Dependancy injection(if available)
 * 3.Bean initialized            -@PostConstruct
 * 4.Bean used
 * 5. Bean destroyed             -@PreDestoyed
 * 
 * --managed by Spring Container
 */