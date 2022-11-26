package Polimorfismo;

public class Sobrecarga {
	
	public void soma ()
	{
		int n1=5,n2=10,soma;
		soma=n1+n2;
		System.out.println("A soma e: "+soma);
	}
	public void soma(int x)
	{
		int n2=10,soma;
		soma=x+n2;
		System.out.println("A soma e: "+soma);
	}
	public void soma(int x, int b)
	{
		int soma;
		soma=x+b;
		System.out.println("A soma e: "+soma);
	}
	public void soma(double x, double b)
	{
		double soma;
		soma=x+b;
		System.out.println("A soma e: "+soma);
	}
	public void soma(String x, String y)
	{
		System.out.println(x+" "+y);
	}
}
