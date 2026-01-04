package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;


@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class
		}
)
public class FirstApplication {

	public static void main(String[] args) {
		System.out.println("this is initial class");
		SpringApplication.run(FirstApplication.class, args);
	}

}
