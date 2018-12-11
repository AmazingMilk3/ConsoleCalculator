package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator tester;
	
	@Before
	public void setup() {
		tester = new Calculator();
	}
	
	@Test
	public void testSummeNatuerlicheZahlen() {
		assertTrue(tester.summe(10, 25) == 35);
	}

}
