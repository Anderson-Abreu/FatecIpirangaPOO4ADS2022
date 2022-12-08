package ExercicioHeranca;

public class BomEstado extends Produto {
	
	@Override
	public void desconto()
	{
		this.preco=this.preco*0.8;
	} 
}
