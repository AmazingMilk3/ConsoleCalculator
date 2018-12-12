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
	
	// Addition Tests
	
	@Test
	public void testSummeNatuerlicheZahlen() {
		assertTrue(tester.summe(10, 25) == 35);
	}
	
	@Test
	public void testSummeMinusPlus() {
		assertTrue(tester.summe(-10, 25) == 15);
	}
	
	@Test
	public void testSummeMinusMinus() {
		assertTrue(tester.summe(-10, -25) == -35);
	}
	
	@Test
	public void testSummeNullPlus() {
		assertTrue(tester.summe(0, 25) == 25);
	}
	
	@Test
	public void testSummeNullMinus() {
		assertTrue(tester.summe(0, -25) == -25);
	}
	
	@Test
	public void testSummeNullNull() {
		assertTrue(tester.summe(0, 0) == 0);
	}
	
	@Test
	public void testSummeMaxNull() {
		assertTrue(tester.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}
	
	@Test
	public void testSummeOverflow() {
		assertTrue(tester.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) < Integer.MAX_VALUE);
	}
	
	// Substraktion Tests
	
	@Test
	public void testSubstraktionNatuerlicheZahlen() {
		assertTrue(tester.substraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubstraktionNatuerlicheZahlenInMinus() {
		assertTrue(tester.substraktion(10, 25) == -15);
	}
	
	@Test
	public void testSubstraktionMinusPlus() {
		assertTrue(tester.substraktion(-25, 10) == -35);
	}

	@Test
	public void testSubstraktionMinusMinus() {
		assertTrue(tester.substraktion(-25, -10) == -15);
	}
	
	@Test
	public void testSubstraktionNullMinus() {
		assertTrue(tester.substraktion(0, -10) == 10);
	}
	
	@Test
	public void testSubstraktionNullMin() {
		assertTrue(tester.substraktion(0, Integer.MIN_VALUE) == Integer.MIN_VALUE);
	}
	
	@Test
	public void testSubstraktionNullNull() {
		assertTrue(tester.substraktion(0, 0) == 0);
	}
	
	@Test
	public void testSubstraktionOverflow() {
		assertTrue(tester.substraktion(Integer.MIN_VALUE, Integer.MIN_VALUE) > Integer.MIN_VALUE);
	}
	
	// Division Tests
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionDurchNull() {
		tester.division(0, 0);
	}
	
	@Test
	public void testDivisionNatuerlicheZahlen() throws ArithmeticException {
		assertTrue(tester.division(10, 10) == 1);
	}
	
	@Test
	public void testDivisionNatuerlicheZahlenKeineKommastellen() {
		assertTrue(tester.division(15, 10) != 1.5);
	}
	
	@Test
	public void testDivisionNatuerlicheZahlenAbgeschnitten() {
		assertTrue(tester.division(15, 10) == 1);
	}
	
	@Test
	public void testDivisionZählerNull() {
		assertTrue(tester.division(0, 1) == 0);
	}
	
	@Test
	public void testDivisionNennerNegativ() {
		assertTrue(tester.division(10,-5) == -2);
	}
	
	@Test
	public void testDivisionNegativNegativGleichPositivPositiv() {
		assertTrue(tester.division(-10,-5) == tester.division(10, 5));
	}
	
	@Test
	public void testDivisionMaxMinPlus1() {
		assertTrue(tester.division(Integer.MAX_VALUE, Integer.MIN_VALUE+1) == -1);
	}
	
	// Visibility Tests
	
	@Test
	public void testVisibilitySummeNatuerlicheZahlenProtected() {
		assertTrue(tester.summeProtected(10, 25) == 35);
	}
	
	@Test
	public void testVisibilitySummeNatuerlicheZahlenPackage() {
		assertTrue(tester.summePackage(10, 25) == 35);
	}
	
	@Test
	public void testVisibilitySummeNatuerlicheZahlenPrivate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method method = Calculator.class.getDeclaredMethod("summePrivate", int.class, int.class);
		method.setAccessible(true);
		assertTrue((Integer) method.invoke(tester, 10, 25) == 35);
	}

}
