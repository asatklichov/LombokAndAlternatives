package net.sahet.lombok.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://github.com/mchernyavskaya
@SpringBootApplication
public class App implements CommandLineRunner {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final Adam anna = Adam.builder().age(31).firstName("Anna").lastName("Smith").build();
		System.out.println(anna);
	}
}
