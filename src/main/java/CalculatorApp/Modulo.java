package CalculatorApp;

public class Modulo extends MathOperations{
	@Override
	public void peformOperation(int operanda,int operandb)
	{
		this.result=operanda%operandb;
	}
}