package Exception;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
		System.out.println("digite um numero: ");
		int n=ler.nextInt();
		System.out.println(30/n);
		}catch(Exception erro) {
			System.out.println("Você cometeu um erro!!"+ erro);
		}
		System.out.println("FIM DO PROGRAMA");
	}

}
