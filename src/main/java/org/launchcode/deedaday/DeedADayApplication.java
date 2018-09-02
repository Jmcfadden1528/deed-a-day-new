package org.launchcode.deedaday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.*;


@SpringBootApplication
@ComponentScan({"org.launchcode.deedaday"})
public class DeedADayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeedADayApplication.class, args);
	}
}
