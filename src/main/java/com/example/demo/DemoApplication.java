package com.example.demo;

import com.example.common.Common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println(Common.FOO);
		SpringApplication.run(DemoApplication.class, args);
	}

}
