package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores l�gicos");
		
		System.out.println("E - AND - && = express�o restritiva");
		System.out.println("Para resultar true, os itens da compara��o, tem que dar tudo true");
		
		
		byte idade = 25;
		float altura = 1.8f;
		double dinheiro = 20000;
		boolean resultado;
		
		resultado  = idade < 18;//false
		
		resultado = altura >= 2.0f;//false
		
		resultado = (idade < 18) && (altura >= 2.0f);//false
		//				 (false) && (false)
		//					   (false)
		
		resultado = (idade >= 18) && (altura >= 2.0f) && (dinheiro >= 50000);//false
		
		resultado = ((idade >= 18) && (idade <=48)) && (altura < 2.35) && (dinheiro >= 50000);//false
		
		System.out.println("OU - OR - || = express�o inclusiva");
		System.out.println("Para resultar true, basta um true em uma compara��o para retornar true");
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade >= 18) || (dinheiro >= 1000);//true
		//				false	  ||  	true
		//						true

	}

}
