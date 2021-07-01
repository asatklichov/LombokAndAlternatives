package net.sahet.lombok.demo;

import java.util.List;
import java.util.Optional;

import lombok.Builder;
import lombok.Value;

/**
 * <pre>
	Generated the Builder pattern by default? 🔴
	Generated helper methods for, i.e., Optional and List? 🔴  
	The number of lines of code to write? 14 ✅
	It requires IDE plugins 🔴
	Are the objects immutable? 🔴  
 * </pre>
 *
 */
@Value
@Builder
public class MyModel {
    Optional<Integer> myOptional;

    String myString;

    List<String> myList;
}