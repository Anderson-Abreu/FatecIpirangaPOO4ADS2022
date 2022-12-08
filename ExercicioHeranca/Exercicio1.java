package ExercicioHeranca;

public class Exercicio1 {

	public static void main(String[] args) {
		Novo n = new Novo();
		ExcelenteEstado e = new ExcelenteEstado();
		BomEstado b = new BomEstado();
		Razoavel r = new Razoavel();
		
		n.setNome("celular");
		n.setDescricao("Motorola");
		n.setPreco(1000);
		
		e.setNome("tv");
		e.setDescricao("LG");
		
		e.setPreco(1000);
	
		b.setNome("Monitor");
		b.setDescricao("17pol tela plana");
		
		b.setPreco(1000);
		
		r.setNome("Fone");
		r.setDescricao("JBL");
		r.desconto();
		r.setPreco(1000);
		
		System.out.println("Dados do produto Novo");
		System.out.println("Nome: "+n.getNome());
		System.out.println("Descricao: "+n.descricao);
		n.desconto();
		System.out.println("Preco: "+n.getPreco());
		
		System.out.println("\nDados do produto Excelente Estado");
		System.out.println("Nome: "+e.getNome());
		System.out.println("Descricao: "+e.descricao);
		e.desconto();
		System.out.println("Preco: "+e.getPreco());
		
		System.out.println("\nDados do produto Bom Estado");
		System.out.println("Nome: "+b.getNome());
		System.out.println("Descricao: "+b.descricao);
		b.desconto();
		System.out.println("Preco: "+b.getPreco());
		
		System.out.println("\nDados do produto Razoavel");
		System.out.println("Nome: "+r.getNome());
		System.out.println("Descricao: "+r.descricao);
		r.desconto();
		System.out.println("Preco: "+r.getPreco());
	}

}
