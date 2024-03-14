package autovalue.model;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import net.sahet.autovalue.data.model.ImmutableMoney;
import net.sahet.autovalue.data.model.MutableMoney;

public class MoneyTest {

	/**
	 * We consider it to have passed when the two money objects are not equal. This
	 * is because we have not overridden the equals method so equality is measured
	 * by comparing the memory references of the objects, which of course are not
	 * going to be different because they are different objects occupying different
	 * memory locations.
	 * 
	 * Each object represents 10,000 USD but Java tells us our money objects are not
	 * equal. We want the two objects to test unequal only when either the currency
	 * amounts are different or the currency types are different.
	 */
	@Test
	public void givenTwoSameValueMoneyObjects_whenEqualityTestFails_thenCorrect() {
		MutableMoney m1 = new MutableMoney(10000, "USD");
		MutableMoney m2 = new MutableMoney(10000, "USD");
		assertFalse(m1.equals(m2));
	}

	@Test
	public void givenTwoSameValueMoneyValueObjects_whenEqualityTestPasses_thenCorrect() {
		ImmutableMoney m1 = new ImmutableMoney(10000, "USD");
		ImmutableMoney m2 = new ImmutableMoney(10000, "USD");
		assertTrue(m1.equals(m2));
	}
}
