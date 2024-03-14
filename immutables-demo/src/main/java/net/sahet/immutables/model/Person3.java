package net.sahet.immutables.model;

import org.immutables.value.Value;
 
@Value.Immutable
public abstract class Person3 {

	abstract String getName();

	/**
	 * @Value.Default annotation allows you to specify a default value that should
	 *                be used when an initial value is not provided. In order to do
	 *                this, you need to create a non-abstract accessor method
	 *                returning a fixed value and annotate it with @Value.Default:
	 * @return
	 */
	@Value.Default
	Integer getAge() {
		return 42;
	}
}
