package CalculatorApp;
import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
        System.out.println( "Calculator" );
        char check;
        do {
        Calculator calculator = new Calculator();
        calculator.readInput();
        calculator.readOperator();
        calculator.carryOperation();
        calculator.printResult();
        System.out.println("Press Y to continue (Y/N)");
        check= input.next().charAt(0); 
        }while(Character.toLowerCase(check)=='y');
        System.out.println( "ThankYou!");
    }
}