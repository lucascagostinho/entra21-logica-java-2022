package br.com.entra21.ifcondicional;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre IF");

		if (true) {
			System.out.println("Essa condição só irá acontecer, caso o a condição de if retorno true");
		}

		System.out.println("Aqui irá aprecer independende do resultado do If, pois está fora do escopo dele");

		if (false) {
			// nunca passaria aqui, pois a condição de if, retornou false
		}
		
		byte idade = 17;
		
		if (idade >= 18) {
			System.out.println("O usuário é maior de idade");
			
		}
		
		if ((idade >= 13) && (idade < 18)) {
			System.out.println("É um adolecente");
			
		}

	}

}
