package net.sahet.immutables.model;

import org.immutables.value.Value;

/**
 * The @Value.Immutable(Prehash = True) Annotation Since our generated classes
 * are immutable and can never get modified, hashCode results will always remain
 * the same and can be computed only once during the object's instantiation.
 * 
 *
 */
@Value.Immutable(prehash = true)
public abstract class Person5 {

	abstract String getName();

	abstract Integer getAge();

}
