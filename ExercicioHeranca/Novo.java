package ExercicioHeranca;

public class Novo extends Produto{

	@Override
	public void desconto()
	{
		System.out.println(getPreco());
	} 
}
