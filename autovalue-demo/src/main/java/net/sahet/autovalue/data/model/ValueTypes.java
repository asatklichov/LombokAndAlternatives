package net.sahet.autovalue.data.model;

import java.util.Objects;

/**
 * As we will see in the following subsection the hashCode of an object must
 * change from instance to instance, but for value-types, we have to tie it to
 * the fields which define the internal state of the value object.
 * 
 * Therefore, even changing a field of the same object would change the hashCode
 * value.
 * 
 * How Value-Types Work The reason value-types must be immutable is to prevent
 * any change to their internal state by the application after they have been
 * instantiated.
 *
 *
 * Why We Need Value-Types The need for value-types comes up quite often. These
 * are cases where we would like to override the default behavior of the
 * original Object class.
 * 
 * As we already know, the default implementation of the Object class considers
 * two objects equal when they have the same identity however for our purposes
 * we consider two objects equal when they have the same internal state.
 */
public final class ValueTypes {
	private final String text;
	private final int number;

	public ValueTypes(String text, int number) {
		this.text = text;
		this.number = number;
	}

	// standard getters

	public String getText() {
		return text;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Foo [text=" + text + ", number=" + number + "]";
	}

	/**
	 * As we will see in the following subsection the hashCode of an object must
	 * change from instance to instance, but for value-types, we have to tie it to
	 * the fields which define the internal state of the value object.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(text, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValueTypes other = (ValueTypes) obj;
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