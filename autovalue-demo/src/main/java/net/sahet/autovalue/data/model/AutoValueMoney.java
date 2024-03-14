package net.sahet.autovalue.data.model;

import com.google.auto.value.AutoValue;

/**
 * AutoValue -
 * 
 * The problem AutoValue solves is to take all the boilerplate code that we
 * talked about in the preceding section, out of our way so that we never have
 * to write it, edit it or even read it.
 *
 */
@AutoValue
public abstract class AutoValueMoney {
	public abstract String getCurrency();

	public abstract long getAmount();

}
