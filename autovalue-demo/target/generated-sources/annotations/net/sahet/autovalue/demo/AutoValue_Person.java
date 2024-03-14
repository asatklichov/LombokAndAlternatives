package net.sahet.autovalue.demo;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Person extends Person {

  private final String lastName;

  private final String firstName;

  private final Integer age;

  private AutoValue_Person(
      String lastName,
      String firstName,
      Integer age) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
  }

  @Override
  public String lastName() {
    return lastName;
  }

  @Override
  public String firstName() {
    return firstName;
  }

  @Override
  public Integer age() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{"
        + "lastName=" + lastName + ", "
        + "firstName=" + firstName + ", "
        + "age=" + age
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Person) {
      Person that = (Person) o;
      return this.lastName.equals(that.lastName())
          && this.firstName.equals(that.firstName())
          && this.age.equals(that.age());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= lastName.hashCode();
    h$ *= 1000003;
    h$ ^= firstName.hashCode();
    h$ *= 1000003;
    h$ ^= age.hashCode();
    return h$;
  }

  static final class Builder extends Person.Builder {
    private String lastName;
    private String firstName;
    private Integer age;
    Builder() {
    }
    @Override
    public Person.Builder lastName(String lastName) {
      if (lastName == null) {
        throw new NullPointerException("Null lastName");
      }
      this.lastName = lastName;
      return this;
    }
    @Override
    public Person.Builder firstName(String firstName) {
      if (firstName == null) {
        throw new NullPointerException("Null firstName");
      }
      this.firstName = firstName;
      return this;
    }
    @Override
    public Person.Builder age(Integer age) {
      if (age == null) {
        throw new NullPointerException("Null age");
      }
      this.age = age;
      return this;
    }
    @Override
    public Person build() {
      String missing = "";
      if (this.lastName == null) {
        missing += " lastName";
      }
      if (this.firstName == null) {
        missing += " firstName";
      }
      if (this.age == null) {
        missing += " age";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Person(
          this.lastName,
          this.firstName,
          this.age);
    }
  }

}
