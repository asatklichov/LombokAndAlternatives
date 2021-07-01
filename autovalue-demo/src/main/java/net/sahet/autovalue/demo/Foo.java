package net.sahet.autovalue.demo;

import java.util.Objects;

/**
 * As we will see in the following subsection the hashCode of an object must
 * change from instance to instance, but for value-types, we have to tie it to
 * the fields which define the internal state of the value object.
 * 
 * Therefore, even changing a field of the same object would change the hashCode
 * value.
 *
 */
public final class Foo {
	private final String text;
	private final int number;

	public Foo(String text, int number) {
		this.text = text;
		this.number = number;
	}

	// standard getters

	@Override
	public int hashCode() {
		return Objects.hash(text, number);
	}

	@Override
	public String toString() {
		return "Foo [text=" + text + ", number=" + number + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foo other = (Foo) obj;
		if (number != other.number)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}
}