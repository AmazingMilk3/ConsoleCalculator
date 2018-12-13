package ch.bbw.ConsoleCalculator;

public class Calculator {

	public int summe(int v1, int v2) {
		return v1 + v2;
	}

	public int substraktion(int v1, int v2) {
		return v1 - v2;
	}

	public int division(int v1, int v2) throws ArithmeticException {
		return v1 / v2;
	}
	
	public String dezimalZuBinär(int v) {
		return Integer.toBinaryString(v);
	}
	
	// Visibility Methods

	protected int summeProtected(int v1, int v2) {
		return v1 + v2;
	}
	
	int summePackage(int v1, int v2) {
		return v1 + v2;
	}
	
	private int summePrivate(int v1, int v2) {
		return v1 + v2;
	}

}
