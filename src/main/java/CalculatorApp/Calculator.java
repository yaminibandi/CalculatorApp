package CalculatorApp;
import java.io.*;
import java.util.*;

public class Calculator {
	private int operanda,operandb,result;
	private char operation;
	Scanner input=new Scanner(System.in);
	public void readInput() {
		System.out.println("Enter the values of Operands a and b");
		setOperanda(input.nextInt());
		setOperandb(input.nextInt());
	}
	public void readOperator()
	{
		System.out.println("Enter the Operation");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println("%");
		setOperation(input.next().charAt(0));
	}
	public void carryOperation()
	{
		String validOperations="+-/*%";
		if(validOperations.contains(Character.toString(this.getOperation())))
		{
			if(this.getOperation()=='+')
			{
				MathOperations mathoperations=new Addition();
				mathoperations.peformOperation(this.getOperanda(),this.getOperandb());
				this.setResult(mathoperations.result);
			}
			else if(this.getOperation()=='-')
			{
				MathOperations mathoperations=new Subtraction();
				mathoperations.peformOperation(this.getOperanda(),this.getOperandb());
				this.setResult(mathoperations.result);
			}
			else if(this.getOperation()=='*')
			{
				MathOperations mathoperations=new Multiplication();
				mathoperations.peformOperation(this.getOperanda(),this.getOperandb());
				this.setResult(mathoperations.result);
			}
			else if(this.getOperation()=='/'){
				MathOperations mathoperations=new Division();
				mathoperations.peformOperation(this.getOperanda(),this.getOperandb());
				this.setResult(mathoperations.result);
			}
			else{
				MathOperations mathoperations=new Modulo();
				mathoperations.peformOperation(this.getOperanda(),this.getOperandb());
				this.setResult(mathoperations.result);
			}
		}
		else {
			System.out.println("Invalid Operation");
		}
	}
	public void printResult() {
		System.out.println(this.operanda+" "+this.operation+" "+this.operandb+" = "+this.result);
	}
	public int getOperanda() {
		return operanda;
	}
	public void setOperanda(int operanda) {
		this.operanda = operanda;
	}
	public int getOperandb() {
		return operandb;
	}
	public void setOperandb(int operandb) {
		this.operandb = operandb;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}