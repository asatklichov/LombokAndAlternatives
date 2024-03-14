package net.sahet.autovalue.app.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * final Person p =
		 * Person.builder().age(31).firstName("Ola").lastName("Ilo").build();
		 * System.out.println(p);
		 */

		System.out.println("---");
	}
}
