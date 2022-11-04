package IntroPOO;

import java.util.Scanner;

public class Introducao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Caneta bic = new Caneta("verde", 0.4);
		Caneta faber = new Caneta("amarelo",0.6);
		Caneta kilom = new Caneta("dourado",1.0);
		
		//bic
		System.out.println("\nDados da caneta Bic");
		bic.estado();
		
		//faber
		System.out.println("\nDados da caneta faber");
		faber.estado();
		
		//kilom
		System.out.println("\nDados da caneta kilom");
		kilom.estado();
		ler.close();
	}
}
