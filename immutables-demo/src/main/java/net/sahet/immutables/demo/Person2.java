package net.sahet.immutables.demo;

import org.immutables.value.Value;

/**
 * @Value.Parameter annotation can be used for specifying fields, for which
 *                  constructor method should be generated.
 *
 */
@Value.Immutable
public abstract class Person2 {

	@Value.Parameter
	abstract String getName();

	@Value.Parameter
	abstract Integer getAge();
}
