package net.sahet.autovalue.data.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clovek {

	private final String name;
	private final List<String> favoriteMovies;

	public Clovek(String name, List<String> favoriteMovies) {
		this.name = name;
		// this.favoriteMovies = favoriteMovies;

		/**
		 * Person class constructor may make a defensive copy of the favoriteMovies list
		 * using the List.copyOf static factory method:
		 * 
		 * 
		 * Java 10 introduced defensive copy static factory methods such as List.copyOf.
		 */
		this.favoriteMovies = new ArrayList<>(favoriteMovies);//List.copyOf

		// prior to Java 10
		//this.favoriteMovies = Collections.unmodifiableList(new ArrayList<>(favoriteMovies));
	}

	public String getName() {
		return name;
	}

	public List<String> getFavoriteMovies() {
		return favoriteMovies;
	}

	// toString, equals, hashcode omitted
}
