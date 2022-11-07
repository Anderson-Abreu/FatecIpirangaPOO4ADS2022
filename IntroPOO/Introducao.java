package IntroPOO;



public class Introducao {

	public static void main(String[] args) {
		
		
		Caneta bic = new Caneta("verde", 0.4);
		Caneta faber = new Caneta("amarelo",0.6);
		Caneta kilom = new Caneta("dourado",1.0);
		
		//bic
		System.out.println("\nDados da caneta Bic");
		//bic.tampada=false;
		bic.setCarga(666);
		System.out.println("Carga: "+bic.getCarga()+"%");
		
		//faber
		System.out.println("\nDados da caneta faber");
		faber.estado();
		
		//kilom
		System.out.println("\nDados da caneta kilom");
		kilom.estado();
	
	}
}
