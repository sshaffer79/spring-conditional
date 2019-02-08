package com.shaffer.springconditional;

import com.shaffer.springconditional.service.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConditionalApplication implements CommandLineRunner {
	@Autowired
	Feature featureService;

	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		featureService.run();
	}
}

