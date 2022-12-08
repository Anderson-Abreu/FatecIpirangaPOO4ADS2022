package ExercicioHeranca;

public class Razoavel extends Produto {
	
	@Override
	public void desconto()
	{
		this.preco*=0.6;
	} 
}
