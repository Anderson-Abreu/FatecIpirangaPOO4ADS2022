package Introducao;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		int n1, n2, op;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1=ler.nextInt();
		System.out.print("Digit o segundo numero: ");
		n2=ler.nextInt();
		
		System.out.print("Escolha:\n1-soma\n2-subtracao\n");
		System.out.println("3-divisao\n4-multiplicacao: ");
		op=ler.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("A soma e: "+(n1+n2));
			break;
		case 2:
			System.out.println("A subtracao e: "+ (n1-n2));
			break;
		case 3:
			if(n2==0)
				System.out.println("Erro!!!");
			else
				System.out.println("A divisao e: "+ n1/n2);
			break;
		case 4:
			System.out.println("A multiplicacao e: "+ n1*n2);
			break;
		default:
			System.out.println("Opcao invalida");
		}
	}

}
