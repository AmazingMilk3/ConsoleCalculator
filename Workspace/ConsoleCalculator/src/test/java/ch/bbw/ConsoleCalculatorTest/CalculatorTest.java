package ch.bbw.ConsoleCalculatorTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.ConsoleCalculator.Calculator;
import javafx.scene.control.SplitPane.Divider;

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
	
	@Test
	public void testSubstraktionNatuerlicheZahlen() {
		assertTrue(tester.substraktion(25, 10) == 15);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionDurchNull() {
			tester.division(0, 0);
	}
	
	@Test
	public void testDivisionNatuerlicheZahlen() throws ArithmeticException {
		tester.division(10, 10);
	}
	

}
