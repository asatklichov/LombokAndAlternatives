package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Person5}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson5.builder()}.
 */
@Generated(from = "Person5", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePerson5 extends Person5 {
  private final String name;
  private final Integer age;
  private transient final int hashCode;

  private ImmutablePerson5(String name, Integer age) {
    this.name = name;
    this.age = age;
    this.hashCode = computeHashCode();
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
   * Copy the current immutable object by setting a value for the {@link Person5#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson5 withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePerson5(newValue, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person5#getAge() age} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson5 withAge(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "age");
    if (this.age.equals(newValue)) return this;
    return new ImmutablePerson5(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson5} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson5
        && equalTo((ImmutablePerson5) another);
  }

  private boolean equalTo(ImmutablePerson5 another) {
    if (hashCode != another.hashCode) return false;
    return name.equals(another.name)
        && age.equals(another.age);
  }

  /**
   * Returns a precomputed-on-construction hash code from attributes: {@code name}, {@code age}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return hashCode;
  }

  private int computeHashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + age.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person5} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person5{"
        + "name=" + name
        + ", age=" + age
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Person5} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person5 instance
   */
  public static ImmutablePerson5 copyOf(Person5 instance) {
    if (instance instanceof ImmutablePerson5) {
      return (ImmutablePerson5) instance;
    }
    return ImmutablePerson5.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson5 ImmutablePerson5}.
   * <pre>
   * ImmutablePerson5.builder()
   *    .name(String) // required {@link Person5#getName() name}
   *    .age(Integer) // required {@link Person5#getAge() age}
   *    .build();
   * </pre>
   * @return A new ImmutablePerson5 builder
   */
  public static ImmutablePerson5.Builder builder() {
    return new ImmutablePerson5.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson5 ImmutablePerson5}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person5", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_AGE = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private Integer age;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person5} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person5 instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      age(instance.getAge());
      return this;
    }

    /**
     * Initializes the value for the {@link Person5#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person5#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(Integer age) {
      this.age = Objects.requireNonNull(age, "age");
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson5 ImmutablePerson5}.
     * @return An immutable instance of Person5
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson5 build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson5(name, age);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      return "Cannot build Person5, some of required attributes are not set " + attributes;
    }
  }
}
