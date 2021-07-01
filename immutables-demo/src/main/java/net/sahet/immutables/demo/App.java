package net.sahet.immutables.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * Generated classes are immutable which means they can't be modified. You must
		 * provide all values. Use @Value.Default if you need default one see Person3.
		 */
		ImmutablePerson john = ImmutablePerson.builder().age(42).firstName("Adam").lastName("John").build();
		System.out.println(john);

		final ImmutablePerson p = ImmutablePerson.builder().age(31).firstName("Ola").lastName("Ili").build();
		System.out.println(p);

		/**
		 * Generated classes are immutable which means they can't be modified. If you
		 * want to modify an already existing object, you can use one of the “withX”
		 * methods, which do not modify an original object, but create a new instance
		 * with a modified field.
		 */
		final ImmutablePerson p1 = p.withAge(23).withLastName("Luka");
		System.out.println(p1);

		// It will be possible to instantiate it in the following way:
		ImmutablePerson imCpy = ImmutablePerson.copyOf(p);
		System.out.println(imCpy);

		/**
		 * @Value.Parameter annotation can be used for specifying fields, for which
		 *                  constructor method should be generated.
		 */
		final ImmutablePerson2 p2 = ImmutablePerson2.of("John", 42);
		System.out.println(p2);

		/**
		 * @Value.Default annotation. No need AGE.   NO ERROR - some of required attributes are not set
		 */
		ImmutablePerson3 j = ImmutablePerson3.builder().name("John").build();
		System.out.println(j.getAge());

		/**
		 * @Value.Auxiliary annotation can be used for annotating a property that will
		 *                  be stored in an object's instance, but will be ignored by
		 *                  equals, hashCode and toString implementations.
		 */
		ImmutablePerson4 j4a = ImmutablePerson4.builder().name("John").age(42).auxiliaryField("Value1") // excluded from
																										// those methods
				.build();

		ImmutablePerson4 j4b = ImmutablePerson4.builder().name("John").age(42).auxiliaryField("Value2") // excluded from
																										// those methods
				.build();

		System.out.println(j4a.equals(j4b));
		System.out.println(j4a.toString().equals(j4b.toString()));
		System.out.println(j4a.hashCode() == j4b.hashCode());

		/**
		 * @Value.Immutable(Prehash = True) Annotation
		 */
		ImmutablePerson5 j5 = ImmutablePerson5.builder().age(23).name("John").build();
		System.out.println(j5.hashCode());

	}
}
