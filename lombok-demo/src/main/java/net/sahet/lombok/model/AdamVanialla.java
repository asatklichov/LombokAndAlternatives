package net.sahet.lombok.model;


import java.util.Objects;

public class AdamVanialla {
	private final String lastName;
	private final String firstName;
	private final Integer age;

	private AdamVanialla(String lastName, String firstName, Integer age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		AdamVanialla that = (AdamVanialla) o;
		return Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName)
				&& Objects.equals(age, that.age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName, firstName, age);
	}

	@Override
	public String toString() {
		return "PersonSimple{" + "lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", age=" + age
				+ '}';
	}

	public static class Builder {
		private String lastName;
		private String firstName;
		private Integer age;

		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder setAge(Integer age) {
			this.age = age;
			return this;
		}

		public AdamVanialla build() {
			return new AdamVanialla(lastName, firstName, age);
		}
	}

	public static void main(String[] args) {
		final AdamVanialla john = new Builder().setFirstName("John").setLastName("Doe").setAge(30).build();
		System.out.println(john);
	}
}
