package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Person2}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson2.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutablePerson2.of()}.
 */
@Generated(from = "Person2", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePerson2 extends Person2 {
  private final String name;
  private final Integer age;

  private ImmutablePerson2(String name, Integer age) {
    this.name = Objects.requireNonNull(name, "name");
    this.age = Objects.requireNonNull(age, "age");
  }

  private ImmutablePerson2(ImmutablePerson2 original, String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  String getName() {
    return name;
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @Override
  Integer getAge() {
    return age;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person2#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson2 withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePerson2(this, newValue, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person2#getAge() age} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson2 withAge(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "age");
    if (this.age.equals(newValue)) return this;
    return new ImmutablePerson2(this, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson2} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson2
        && equalTo((ImmutablePerson2) another);
  }

  private boolean equalTo(ImmutablePerson2 another) {
    return name.equals(another.name)
        && age.equals(another.age);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code age}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + age.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person2} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person2{"
        + "name=" + name
        + ", age=" + age
        + "}";
  }

  /**
   * Construct a new immutable {@code Person2} instance.
   * @param name The value for the {@code name} attribute
   * @param age The value for the {@code age} attribute
   * @return An immutable Person2 instance
   */
  public static ImmutablePerson2 of(String name, Integer age) {
    return new ImmutablePerson2(name, age);
  }

  /**
   * Creates an immutable copy of a {@link Person2} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person2 instance
   */
  public static ImmutablePerson2 copyOf(Person2 instance) {
    if (instance instanceof ImmutablePerson2) {
      return (ImmutablePerson2) instance;
    }
    return ImmutablePerson2.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson2 ImmutablePerson2}.
   * <pre>
   * ImmutablePerson2.builder()
   *    .name(String) // required {@link Person2#getName() name}
   *    .age(Integer) // required {@link Person2#getAge() age}
   *    .build();
   * </pre>
   * @return A new ImmutablePerson2 builder
   */
  public static ImmutablePerson2.Builder builder() {
    return new ImmutablePerson2.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson2 ImmutablePerson2}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person2", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_AGE = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private Integer age;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person2} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person2 instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      age(instance.getAge());
      return this;
    }

    /**
     * Initializes the value for the {@link Person2#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person2#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(Integer age) {
      this.age = Objects.requireNonNull(age, "age");
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson2 ImmutablePerson2}.
     * @return An immutable instance of Person2
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson2 build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson2(null, name, age);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      return "Cannot build Person2, some of required attributes are not set " + attributes;
    }
  }
}
