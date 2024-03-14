package net.sahet.autovalue.demo;

import java.util.ArrayList;
import java.util.List;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ClovekAutoValue {

	public static ClovekAutoValue of(String name, List<String> favoriteMovies) {
		// return new AutoValue_ClovekAutoValue(name, favoriteMovies);

		/**
		 * The constructor AutoValue generates will not automatically create any
		 * defensive copies, including one for the favoriteMovies collection.
		 */
		// create defensive copy before calling constructor
		List<String> favoriteMoviesCopy = new ArrayList<>(); // List.copyOf(favoriteMovies);
		return null ;//new AutoValue_ClovekAutoValue(name, favoriteMovies);
	}

	public abstract String name();

	public abstract List<String> favoriteMovies();
}
