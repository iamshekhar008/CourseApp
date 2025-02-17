package com.springRest.CourseApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.sql.SQLOutput;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CourseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseAppApplication.class, args);
	}

}
