package Polimorfismo;

public class Calcular {
	public void calculo(int x,int y)
	{
		int resp;
		if(y==0)
			System.out.println("Valor invalido");
		else
		{
			resp=x%y;
			System.out.println("O modulo e: "+resp);
		}
	}
	public void calculo(double x, double y)
	{
		double resp;
		if(y==0)
			System.out.println("Divis�o invalida");
		else
		{
			resp=x/y;
			System.out.println("A divisao e: "+resp);
			
		}
	}
	public void calculo(String x, String y)
	{
		String resp;
		resp=x+y;
		System.out.println(resp);
	}
}
		
