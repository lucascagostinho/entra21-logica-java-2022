package br.com.entra21.exerciocio.condicionais02;

public class Main {

	public static void main(String[] args) {
		
		int nascimento, idade;
		int ano = 2022;
		
		nascimento = 1997;
		idade = ano - nascimento;
		
		if (idade >= 18) {
			System.out.println("J� possui idade para votar");
		}else {
			System.out.println("N�o possui idade para votar");
		}

	}

}
