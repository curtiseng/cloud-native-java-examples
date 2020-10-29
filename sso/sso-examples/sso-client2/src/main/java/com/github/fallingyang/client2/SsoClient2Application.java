package com.github.fallingyang.client2;

import org.apache.catalina.filters.RequestDumperFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzifeng
 */
@SpringBootApplication
@RestController
public class SsoClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SsoClient2Application.class, args);
	}

	@GetMapping("/api")
	public String call() {
		return "hello, there is client2";
	}

	@Bean
	RequestDumperFilter requestDumperFilter() {
		return new RequestDumperFilter();
	}
}
