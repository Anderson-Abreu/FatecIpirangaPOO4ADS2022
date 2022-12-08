package ExercicioHeranca;

public class ExcelenteEstado extends Produto{
	
	@Override
	public void desconto()
	{
		this.preco=this.preco-this.preco*0.1;
	} 
}
