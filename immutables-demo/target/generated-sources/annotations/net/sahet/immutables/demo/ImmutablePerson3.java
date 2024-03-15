package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Person3}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson3.builder()}.
 */
@Generated(from = "Person3", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePerson3 extends Person3 {
  private final String name;
  private final Integer age;

  private ImmutablePerson3(ImmutablePerson3.Builder builder) {
    this.name = builder.name;
    this.age = builder.age != null
        ? builder.age
        : Objects.requireNonNull(super.getAge(), "age");
  }

  private ImmutablePerson3(String name, Integer age) {
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
   * @Value.Default annotation allows you to specify a default value that should
   *                be used when an initial value is not provided. In order to do
   *                this, you need to create a non-abstract accessor method
   *                returning a fixed value and annotate it with @Value.Default:
   * @return
   */
  @Override
  Integer getAge() {
    return age;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person3#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson3 withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePerson3(newValue, this.age);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person3#getAge() age} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson3 withAge(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "age");
    if (this.age.equals(newValue)) return this;
    return new ImmutablePerson3(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson3} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson3
        && equalTo((ImmutablePerson3) another);
  }

  private boolean equalTo(ImmutablePerson3 another) {
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
   * Prints the immutable value {@code Person3} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person3{"
        + "name=" + name
        + ", age=" + age
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Person3} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person3 instance
   */
  public static ImmutablePerson3 copyOf(Person3 instance) {
    if (instance instanceof ImmutablePerson3) {
      return (ImmutablePerson3) instance;
    }
    return ImmutablePerson3.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson3 ImmutablePerson3}.
   * <pre>
   * ImmutablePerson3.builder()
   *    .name(String) // required {@link Person3#getName() name}
   *    .age(Integer) // optional {@link Person3#getAge() age}
   *    .build();
   * </pre>
   * @return A new ImmutablePerson3 builder
   */
  public static ImmutablePerson3.Builder builder() {
    return new ImmutablePerson3.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson3 ImmutablePerson3}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person3", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private String name;
    private Integer age;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person3} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person3 instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      age(instance.getAge());
      return this;
    }

    /**
     * Initializes the value for the {@link Person3#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person3#getAge() age} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Person3#getAge() age}.</em>
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(Integer age) {
      this.age = Objects.requireNonNull(age, "age");
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson3 ImmutablePerson3}.
     * @return An immutable instance of Person3
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson3 build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson3(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build Person3, some of required attributes are not set " + attributes;
    }
  }
}
