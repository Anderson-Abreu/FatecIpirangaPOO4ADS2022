package Collection;

import java.util.ArrayList;

public class Exemplo2 {

	public static void main(String[] args) {
		Aula a1 = new Aula("Laco", 90);
		Aula a2 = new Aula("Heranca", 60);
		Aula a3 = new Aula("Objetos", 120);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		System.out.println(aulas);
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
	}

}
