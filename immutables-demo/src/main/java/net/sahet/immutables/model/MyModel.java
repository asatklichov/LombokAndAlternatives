package net.sahet.immutables.model;

import java.util.List;
import java.util.Optional;

import org.immutables.value.Value;

/**
 * <pre>
    Generated the Builder pattern by default? ✅
	Generated helper methods for, i.e., Optional and List? ✅, 
	The number of lines of code to write? 15 ✅
	It doesn't require IDE plugin ✅
	Are the objects immutable? ✅,  
 * </pre>
 *
 */
@Value.Immutable
public interface MyModel {
	Optional<Integer> myOptional();

	String myString();

	List<String> myList();
}