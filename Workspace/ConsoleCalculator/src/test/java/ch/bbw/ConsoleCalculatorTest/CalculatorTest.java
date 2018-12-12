package ch.bbw.ConsoleCalculatorTest;

import static org.junit.Assert.*;

import java.lang.reflect.*;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.ConsoleCalculator.Calculator;

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
	public void testSummeNatuerlicheZahlenProtected() {
		assertTrue(tester.summeProtected(10, 25) == 35);
	}
	
	@Test
	public void testSummeNatuerlicheZahlenPackage() {
		assertTrue(tester.summePackage(10, 25) == 35);
	}
	
	@Test
	public void testSummeNatuerlicheZahlenPrivate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method method = Calculator.class.getDeclaredMethod("summePrivate", int.class, int.class);
		method.setAccessible(true);
		assertTrue((Integer) method.invoke(tester, 10, 25) == 35);
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
