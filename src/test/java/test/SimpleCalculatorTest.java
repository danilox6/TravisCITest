package test;

import static org.junit.Assert.*;
import it.unisannio.SimpleCalculator;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testSum() {
		assertEquals("Adding 2 to 3 should return 5", 5, SimpleCalculator.add(2, 3));
	}
	
	@Test
	public void testProduct() {
		assertEquals("Multiplying 2 by 3 should return 6", 6, SimpleCalculator.multiply(2, 3));
	}

}
