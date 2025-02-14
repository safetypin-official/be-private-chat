package com.safetypin.privatechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PrivateChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivateChatApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class HelloController {
	@GetMapping
	public String sayHello() {
		return "Hello, World!";
	}
}