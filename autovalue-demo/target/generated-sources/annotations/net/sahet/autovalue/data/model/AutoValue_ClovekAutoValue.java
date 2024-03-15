package net.sahet.autovalue.data.model;

import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClovekAutoValue extends ClovekAutoValue {

  private final String name;

  private final List<String> favoriteMovies;

  AutoValue_ClovekAutoValue(
      String name,
      List<String> favoriteMovies) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (favoriteMovies == null) {
      throw new NullPointerException("Null favoriteMovies");
    }
    this.favoriteMovies = favoriteMovies;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public List<String> favoriteMovies() {
    return favoriteMovies;
  }

  @Override
  public String toString() {
    return "ClovekAutoValue{"
        + "name=" + name + ", "
        + "favoriteMovies=" + favoriteMovies
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClovekAutoValue) {
      ClovekAutoValue that = (ClovekAutoValue) o;
      return this.name.equals(that.name())
          && this.favoriteMovies.equals(that.favoriteMovies());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= favoriteMovies.hashCode();
    return h$;
  }

}
