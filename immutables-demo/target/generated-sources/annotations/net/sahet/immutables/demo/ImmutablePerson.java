package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@Generated(from = "Person", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePerson extends Person {
  private final String lastName;
  private final String firstName;
  private final Integer age;

  private ImmutablePerson(String lastName, String firstName, Integer age) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @Override
  public String lastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @Override
  public String firstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @Override
  public Integer age() {
    return age;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#lastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withLastName(String value) {
    String newValue = Objects.requireNonNull(value, "lastName");
    if (this.lastName.equals(newValue)) return this;
    return new ImmutablePerson(newValue, this.firstName, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#firstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withFirstName(String value) {
    String newValue = Objects.requireNonNull(value, "firstName");
    if (this.firstName.equals(newValue)) return this;
    return new ImmutablePerson(this.lastName, newValue, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#age() age} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withAge(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "age");
    if (this.age.equals(newValue)) return this;
    return new ImmutablePerson(this.lastName, this.firstName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return lastName.equals(another.lastName)
        && firstName.equals(another.firstName)
        && age.equals(another.age);
  }

  /**
   * Computes a hash code from attributes: {@code lastName}, {@code firstName}, {@code age}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + age.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person{"
        + "lastName=" + lastName
        + ", firstName=" + firstName
        + ", age=" + age
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Person} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static ImmutablePerson copyOf(Person instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ImmutablePerson.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson ImmutablePerson}.
   * <pre>
   * ImmutablePerson.builder()
   *    .lastName(String) // required {@link Person#lastName() lastName}
   *    .firstName(String) // required {@link Person#firstName() firstName}
   *    .age(Integer) // required {@link Person#age() age}
   *    .build();
   * </pre>
   * @return A new ImmutablePerson builder
   */
  public static ImmutablePerson.Builder builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_LAST_NAME = 0x1L;
    private static final long INIT_BIT_FIRST_NAME = 0x2L;
    private static final long INIT_BIT_AGE = 0x4L;
    private long initBits = 0x7L;

    private String lastName;
    private String firstName;
    private Integer age;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person instance) {
      Objects.requireNonNull(instance, "instance");
      lastName(instance.lastName());
      firstName(instance.firstName());
      age(instance.age());
      return this;
    }

    /**
     * Initializes the value for the {@link Person#lastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#firstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#age() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(Integer age) {
      this.age = Objects.requireNonNull(age, "age");
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson(lastName, firstName, age);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }
}
