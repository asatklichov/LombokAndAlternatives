package net.sahet.immutables.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MyModel}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMyModel.builder()}.
 */
@Generated(from = "MyModel", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableMyModel implements MyModel {
  private final Integer myOptional;
  private final String myString;
  private final List<String> myList;

  private ImmutableMyModel(Integer myOptional, String myString, List<String> myList) {
    this.myOptional = myOptional;
    this.myString = myString;
    this.myList = myList;
  }

  /**
   * @return The value of the {@code myOptional} attribute
   */
  @Override
  public Optional<Integer> myOptional() {
    return Optional.ofNullable(myOptional);
  }

  /**
   * @return The value of the {@code myString} attribute
   */
  @Override
  public String myString() {
    return myString;
  }

  /**
   * @return The value of the {@code myList} attribute
   */
  @Override
  public List<String> myList() {
    return myList;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MyModel#myOptional() myOptional} attribute.
   * @param value The value for myOptional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMyModel withMyOptional(int value) {
    Integer newValue = value;
    if (Objects.equals(this.myOptional, newValue)) return this;
    return new ImmutableMyModel(newValue, this.myString, this.myList);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MyModel#myOptional() myOptional} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for myOptional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMyModel withMyOptional(Optional<Integer> optional) {
    Integer value = optional.orElse(null);
    if (Objects.equals(this.myOptional, value)) return this;
    return new ImmutableMyModel(value, this.myString, this.myList);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MyModel#myString() myString} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for myString
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMyModel withMyString(String value) {
    String newValue = Objects.requireNonNull(value, "myString");
    if (this.myString.equals(newValue)) return this;
    return new ImmutableMyModel(this.myOptional, newValue, this.myList);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MyModel#myList() myList}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMyModel withMyList(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMyModel(this.myOptional, this.myString, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MyModel#myList() myList}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of myList elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMyModel withMyList(Iterable<String> elements) {
    if (this.myList == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMyModel(this.myOptional, this.myString, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMyModel} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMyModel
        && equalTo((ImmutableMyModel) another);
  }

  private boolean equalTo(ImmutableMyModel another) {
    return Objects.equals(myOptional, another.myOptional)
        && myString.equals(another.myString)
        && myList.equals(another.myList);
  }

  /**
   * Computes a hash code from attributes: {@code myOptional}, {@code myString}, {@code myList}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(myOptional);
    h += (h << 5) + myString.hashCode();
    h += (h << 5) + myList.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MyModel} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MyModel{");
    if (myOptional != null) {
      builder.append("myOptional=").append(myOptional);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("myString=").append(myString);
    builder.append(", ");
    builder.append("myList=").append(myList);
    return builder.append("}").toString();
  }

  /**
   * Creates an immutable copy of a {@link MyModel} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MyModel instance
   */
  public static ImmutableMyModel copyOf(MyModel instance) {
    if (instance instanceof ImmutableMyModel) {
      return (ImmutableMyModel) instance;
    }
    return ImmutableMyModel.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMyModel ImmutableMyModel}.
   * <pre>
   * ImmutableMyModel.builder()
   *    .myOptional(Integer) // optional {@link MyModel#myOptional() myOptional}
   *    .myString(String) // required {@link MyModel#myString() myString}
   *    .addMyList|addAllMyList(String) // {@link MyModel#myList() myList} elements
   *    .build();
   * </pre>
   * @return A new ImmutableMyModel builder
   */
  public static ImmutableMyModel.Builder builder() {
    return new ImmutableMyModel.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMyModel ImmutableMyModel}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MyModel", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_MY_STRING = 0x1L;
    private long initBits = 0x1L;

    private Integer myOptional;
    private String myString;
    private List<String> myList = new ArrayList<String>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MyModel} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MyModel instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Integer> myOptionalOptional = instance.myOptional();
      if (myOptionalOptional.isPresent()) {
        myOptional(myOptionalOptional);
      }
      myString(instance.myString());
      addAllMyList(instance.myList());
      return this;
    }

    /**
     * Initializes the optional value {@link MyModel#myOptional() myOptional} to myOptional.
     * @param myOptional The value for myOptional
     * @return {@code this} builder for chained invocation
     */
    public final Builder myOptional(int myOptional) {
      this.myOptional = myOptional;
      return this;
    }

    /**
     * Initializes the optional value {@link MyModel#myOptional() myOptional} to myOptional.
     * @param myOptional The value for myOptional
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder myOptional(Optional<Integer> myOptional) {
      this.myOptional = myOptional.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link MyModel#myString() myString} attribute.
     * @param myString The value for myString 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder myString(String myString) {
      this.myString = Objects.requireNonNull(myString, "myString");
      initBits &= ~INIT_BIT_MY_STRING;
      return this;
    }

    /**
     * Adds one element to {@link MyModel#myList() myList} list.
     * @param element A myList element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMyList(String element) {
      this.myList.add(Objects.requireNonNull(element, "myList element"));
      return this;
    }

    /**
     * Adds elements to {@link MyModel#myList() myList} list.
     * @param elements An array of myList elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMyList(String... elements) {
      for (String element : elements) {
        this.myList.add(Objects.requireNonNull(element, "myList element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link MyModel#myList() myList} list.
     * @param elements An iterable of myList elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder myList(Iterable<String> elements) {
      this.myList.clear();
      return addAllMyList(elements);
    }

    /**
     * Adds elements to {@link MyModel#myList() myList} list.
     * @param elements An iterable of myList elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMyList(Iterable<String> elements) {
      for (String element : elements) {
        this.myList.add(Objects.requireNonNull(element, "myList element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableMyModel ImmutableMyModel}.
     * @return An immutable instance of MyModel
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMyModel build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMyModel(myOptional, myString, createUnmodifiableList(true, myList));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_MY_STRING) != 0) attributes.add("myString");
      return "Cannot build MyModel, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
