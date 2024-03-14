package net.sahet.lombok.model;

import lombok.ToString;

/**
 * Previous developers truly believed the problem was in the DAO, but after
 * looking into the delomboked code I realized that this @ToString annotation
 * was generating an implementation like this:
 * 
 * 
 * public toString() { return "MyEnum"; }
 * 
 * 
 * This is because the purpose of the generated toString() method is to print
 * the type plus the values of all the fields, something like
 * MyEnum(field1=value1, field2=value2,...), however, here we didn't have any
 * field so just the type was printed.
 *
 */
@ToString
public enum MyEnum {
	VALUE_A, VALUE_B
}