package ExercicioHeranca;

public abstract class Produto {

	protected String nome;
	protected String descricao;
	protected double preco;
	
	public void desconto()
	{
		System.out.println("Não há desconto");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
