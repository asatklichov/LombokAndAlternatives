package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Person4}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson4.builder()}.
 */
@Generated(from = "Person4", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePerson4 extends Person4 {
  private final String name;
  private final Integer age;
  private final String auxiliaryField;

  private ImmutablePerson4(String name, Integer age, String auxiliaryField) {
    this.name = name;
    this.age = age;
    this.auxiliaryField = auxiliaryField;
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
   * The @Value.Auxiliary annotation can be used for annotating a property that
   * will be stored in an object's instance, but will be ignored by equals,
   * hashCode and toString implementations.
   * 
   * @return
   */
  @Override
  String getAuxiliaryField() {
    return auxiliaryField;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person4#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson4 withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePerson4(newValue, this.age, this.auxiliaryField);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person4#getAge() age} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for age
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson4 withAge(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "age");
    if (this.age.equals(newValue)) return this;
    return new ImmutablePerson4(this.name, newValue, this.auxiliaryField);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person4#getAuxiliaryField() auxiliaryField} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for auxiliaryField
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson4 withAuxiliaryField(String value) {
    String newValue = Objects.requireNonNull(value, "auxiliaryField");
    if (this.auxiliaryField.equals(newValue)) return this;
    return new ImmutablePerson4(this.name, this.age, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson4} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson4
        && equalTo((ImmutablePerson4) another);
  }

  private boolean equalTo(ImmutablePerson4 another) {
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
   * Prints the immutable value {@code Person4} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person4{"
        + "name=" + name
        + ", age=" + age
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Person4} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person4 instance
   */
  public static ImmutablePerson4 copyOf(Person4 instance) {
    if (instance instanceof ImmutablePerson4) {
      return (ImmutablePerson4) instance;
    }
    return ImmutablePerson4.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePerson4 ImmutablePerson4}.
   * <pre>
   * ImmutablePerson4.builder()
   *    .name(String) // required {@link Person4#getName() name}
   *    .age(Integer) // required {@link Person4#getAge() age}
   *    .auxiliaryField(String) // required {@link Person4#getAuxiliaryField() auxiliaryField}
   *    .build();
   * </pre>
   * @return A new ImmutablePerson4 builder
   */
  public static ImmutablePerson4.Builder builder() {
    return new ImmutablePerson4.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson4 ImmutablePerson4}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person4", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_AGE = 0x2L;
    private static final long INIT_BIT_AUXILIARY_FIELD = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private Integer age;
    private String auxiliaryField;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person4} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person4 instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      age(instance.getAge());
      auxiliaryField(instance.getAuxiliaryField());
      return this;
    }

    /**
     * Initializes the value for the {@link Person4#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person4#getAge() age} attribute.
     * @param age The value for age 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder age(Integer age) {
      this.age = Objects.requireNonNull(age, "age");
      initBits &= ~INIT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Person4#getAuxiliaryField() auxiliaryField} attribute.
     * @param auxiliaryField The value for auxiliaryField 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder auxiliaryField(String auxiliaryField) {
      this.auxiliaryField = Objects.requireNonNull(auxiliaryField, "auxiliaryField");
      initBits &= ~INIT_BIT_AUXILIARY_FIELD;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson4 ImmutablePerson4}.
     * @return An immutable instance of Person4
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson4 build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson4(name, age, auxiliaryField);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_AGE) != 0) attributes.add("age");
      if ((initBits & INIT_BIT_AUXILIARY_FIELD) != 0) attributes.add("auxiliaryField");
      return "Cannot build Person4, some of required attributes are not set " + attributes;
    }
  }
}
