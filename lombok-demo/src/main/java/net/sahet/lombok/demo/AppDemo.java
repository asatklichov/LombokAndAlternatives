package net.sahet.lombok.demo;

import net.sahet.lombok.model.Adam;

public class AppDemo {
	public static void main(String[] args) {
		final Adam anna = Adam.builder().age(31).firstName("Anna").lastName("Smith").build();
		System.out.println(anna);
	}
}
