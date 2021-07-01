package net.sahet.autovalue.demo;

import java.util.ArrayList;
import java.util.List;

//https://www.baeldung.com/autovalue-defensive-copies
public class DefensiveCopyDemo {

	public static void main(String[] args) {
		List<String> favoriteMovies = new ArrayList();
		favoriteMovies.add("Clerks"); // fine
		Clovek person = new Clovek("Katy", favoriteMovies);
		favoriteMovies.add("Dogma"); // oh, no!

		// make defensive in constructor
		// or in ClovekAutoBuild
	}

}
