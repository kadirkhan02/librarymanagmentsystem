package LibraryManagmentSystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class LibraryManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(LibraryManagmentSystemApplication.class, args);
//
	}

    @Override

    public void run(String... args) throws Exception {
        System.out.println("hello");
    }
    @RestController
    class LibraryController {

        @GetMapping("/")   // use @GetMapping instead of @RequestMapping for simple GET
        public String hello() {
            return "Hello, Library Management System is running!";
        }
    }
}
