package ru.chubanova.userdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableScheduling
@EnableWebMvc
@SpringBootApplication
public class UserdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdataApplication.class, args);
	}

}
