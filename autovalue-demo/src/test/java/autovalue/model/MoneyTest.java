package autovalue.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import net.sahet.autovalue.demo.AutoValueMoney;
import net.sahet.autovalue.demo.AutoValueMoneyWithBuilder;
import net.sahet.autovalue.demo.ImmutableMoney;
import net.sahet.autovalue.demo.MutableMoney;

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

	/**
	 * The only difference is that we overrode the equals(Object) and hashCode()
	 * methods, now we have control over how we want Java to compare our money
	 * objects.
	 * 
	 * 
	 * Notice the semantics of this test, we expect it to pass when both money
	 * objects test equal via the equals method.
	 */
	@Test
	public void givenTwoSameValueMoneyValueObjects_whenEqualityTestPasses_thenCorrect() {
		ImmutableMoney m1 = new ImmutableMoney(10000, "USD");
		ImmutableMoney m2 = new ImmutableMoney(10000, "USD");
		assertTrue(m1.equals(m2));
	}

	@Test
	public void givenValueTypeWithAutoValue_whenFieldsCorrectlySet_thenCorrect() {
		AutoValueMoney m = AutoValueMoney.create("USD", 10000);
		assertEquals(m.getAmount(), 10000);
		assertEquals(m.getCurrency(), "USD");
	}

	@Test
	public void given2DifferentValueTypesWithAutoValue_whenNotEqual_thenCorrect() {
		AutoValueMoney m1 = AutoValueMoney.create("GBP", 5000);
		AutoValueMoney m2 = AutoValueMoney.create("USD", 5000);
		assertFalse(m1.equals(m2));
	}

	// If we want to know that the field values are actually correctly set through
	// the builder
	@Test
	public void givenValueTypeWithBuilder_whenFieldsCorrectlySet_thenCorrect() {
		AutoValueMoneyWithBuilder m = AutoValueMoneyWithBuilder.builder().setAmount(5000).setCurrency("USD").build();
		assertEquals(m.getAmount(), 5000);
		assertEquals(m.getCurrency(), "USD");
	}

	// To test that equality depends on internal state:
	@Test
	public void given2EqualValueTypesWithBuilder_whenEqual_thenCorrect() {
		AutoValueMoneyWithBuilder m1 = AutoValueMoneyWithBuilder.builder().setAmount(5000).setCurrency("USD").build();
		AutoValueMoneyWithBuilder m2 = AutoValueMoneyWithBuilder.builder().setAmount(5000).setCurrency("USD").build();
		assertTrue(m1.equals(m2));
	}

	// And when the field values are different:
	@Test
	public void given2DifferentValueTypesBuilder_whenNotEqual_thenCorrect() {
		AutoValueMoneyWithBuilder m1 = AutoValueMoneyWithBuilder.builder().setAmount(5000).setCurrency("USD").build();
		AutoValueMoneyWithBuilder m2 = AutoValueMoneyWithBuilder.builder().setAmount(5000).setCurrency("GBP").build();
		assertFalse(m1.equals(m2));
	}

}
