package com.zcj.springconfigserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerDemoApplication.class, args);
	}
}
