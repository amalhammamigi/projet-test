package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ProjetTestApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to my project..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetTestApplication.class, args);
	}

}




