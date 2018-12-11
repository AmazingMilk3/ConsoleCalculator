package ch.bbw.ConsoleCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	
    	System.out.println("Console Calculator");
    	System.out.println("**********************");
    	System.out.println();
    	
    	int valueA = 5;
    	int valueB = 10;
    	System.out.println("Summe " + valueA + " + " + valueB +" = " + calculator.summe(valueA, valueB));
    }
}
