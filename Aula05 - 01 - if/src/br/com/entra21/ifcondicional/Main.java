package br.com.entra21.ifcondicional;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre IF");

		if (true) {
			System.out.println("Essa condi��o s� ir� acontecer, caso o a condi��o de if retorno true");
		}

		System.out.println("Aqui ir� aprecer independende do resultado do If, pois est� fora do escopo dele");

		if (false) {
			// nunca passaria aqui, pois a condi��o de if, retornou false
		}
		
		byte idade = 17;
		
		if (idade >= 18) {
			System.out.println("O usu�rio � maior de idade");
			
		}
		
		if ((idade >= 13) && (idade < 18)) {
			System.out.println("� um adolecente");
			
		}

	}

}
