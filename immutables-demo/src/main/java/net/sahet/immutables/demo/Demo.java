package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	//https://immutables.github.io/getstarted.html
	//https://www.baeldung.com/immutables
	public static void main(String[] args) {
		String name = "baeldung";
		String newName = name.replace("dung", "----");

		System.out.println("baeldung".equals(name));
		System.out.println("bael----".equals(newName));
		
		final List<String> strings = new ArrayList<>();
		System.out.println(0 == strings.size());
		strings.add("baeldung");
		//false, because adding an element to the list changes its size, therefore, it isn’t an immutable object. 
		System.out.println(0 == strings.size());		
	}
}
