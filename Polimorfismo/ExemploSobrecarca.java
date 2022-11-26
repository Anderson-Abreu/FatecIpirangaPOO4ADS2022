package Polimorfismo;

public class ExemploSobrecarca {

	public static void main(String[] args) {
		Sobrecarga s = new Sobrecarga();
		s.soma();
		s.soma(20);
		s.soma(3.14, 2.75);
		s.soma(7, 6);
		s.soma("teste", "concatenar");
	}

}
