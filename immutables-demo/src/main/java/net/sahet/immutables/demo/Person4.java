package net.sahet.immutables.demo;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Person4 {

	abstract String getName();

	abstract Integer getAge();

	/**
	 * The @Value.Auxiliary annotation can be used for annotating a property that
	 * will be stored in an object's instance, but will be ignored by equals,
	 * hashCode and toString implementations.
	 * 
	 * @return
	 */
	@Value.Auxiliary
	abstract String getAuxiliaryField();
}
