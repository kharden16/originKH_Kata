package com.karmen.kata.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.karmen.kata.message.*;
/**
 * 
 * @author karmenharden
 * Main / Driver class
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.karmen")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
