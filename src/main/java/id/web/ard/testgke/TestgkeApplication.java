package id.web.ard.testgke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestgkeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestgkeApplication.class, args);
	}
}

@RestController
class TestREST {
	
	@GetMapping(value = "/test")
	public String test() {
		return "Hello GKE";
	}
}