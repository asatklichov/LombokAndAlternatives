package net.sahet.autovalue.data.model;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MyModel extends MyModel {

  private final Optional<Integer> myOptional;

  private final String myString;

  private final List<String> myList;

  private AutoValue_MyModel(
      Optional<Integer> myOptional,
      String myString,
      List<String> myList) {
    this.myOptional = myOptional;
    this.myString = myString;
    this.myList = myList;
  }

  @Override
  public Optional<Integer> myOptional() {
    return myOptional;
  }

  @Override
  public String myString() {
    return myString;
  }

  @Override
  public List<String> myList() {
    return myList;
  }

  @Override
  public String toString() {
    return "MyModel{"
        + "myOptional=" + myOptional + ", "
        + "myString=" + myString + ", "
        + "myList=" + myList
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MyModel) {
      MyModel that = (MyModel) o;
      return this.myOptional.equals(that.myOptional())
          && this.myString.equals(that.myString())
          && this.myList.equals(that.myList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= myOptional.hashCode();
    h$ *= 1000003;
    h$ ^= myString.hashCode();
    h$ *= 1000003;
    h$ ^= myList.hashCode();
    return h$;
  }

  static final class Builder extends MyModel.Builder {
    private Optional<Integer> myOptional = Optional.empty();
    private String myString;
    private List<String> myList;
    Builder() {
    }
    @Override
    public MyModel.Builder setMyOptional(Optional<Integer> myOptional) {
      if (myOptional == null) {
        throw new NullPointerException("Null myOptional");
      }
      this.myOptional = myOptional;
      return this;
    }
    @Override
    public MyModel.Builder setMyString(String myString) {
      if (myString == null) {
        throw new NullPointerException("Null myString");
      }
      this.myString = myString;
      return this;
    }
    @Override
    public MyModel.Builder setMyList(List<String> myList) {
      if (myList == null) {
        throw new NullPointerException("Null myList");
      }
      this.myList = myList;
      return this;
    }
    @Override
    public MyModel build() {
      String missing = "";
      if (this.myString == null) {
        missing += " myString";
      }
      if (this.myList == null) {
        missing += " myList";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MyModel(
          this.myOptional,
          this.myString,
          this.myList);
    }
  }

}
