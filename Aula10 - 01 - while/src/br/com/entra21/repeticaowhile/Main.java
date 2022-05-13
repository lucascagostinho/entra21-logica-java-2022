package br.com.entra21.repeticaowhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("1 - while \n2 - do-while \n 0 - Sair");
		System.out.println("Escolha uma opção");
		// instanciando um objeto da classe Scanner e já utilizando o metodo next
		switch (new Scanner(System.in).next().toLowerCase()) {

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do-while":
			aprenderDoWhile();
			break;

		case "0", "sair":
			System.out.println("Escolheu sair");
			break;

		default:
			System.out.println("Opção inválida");
			main(null);
			break;
		}

	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender o while aqui");

		byte contagem = 1;

		while (contagem <= 10) {// condição de permanencia /// enquanto contagem for menor ou igual a 10 execute
			System.out.println("contando " + contagem);
			contagem++;
		}
		// para fazer uma repetição com base em quantidade é gerado muito código
		System.out.println("Acabei");

		Scanner enetrada = new Scanner(System.in);

		System.out.println("Deseja iniciar uma repetição");
		String resposta = enetrada.next();
		// responta pode poder entrar ou não entrar
		while (resposta.equalsIgnoreCase("continuar") || resposta.equals("sim")) {
			System.out.println("Voce respondeu: " + resposta);
			System.out.println("Deseja continuar?");
			// resposta que saia ou permance
			resposta = enetrada.next();
			// enquanto a resposta for sim ou continuar, ele vai repitir o escopo do while
			// caso ele digite algo diferente, ele sai do escopo

		}

		System.out.println("Terminou meu while com base em decisção");

		main(null);
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender o do-while aqui");

		Scanner entrada = new Scanner(System.in);
		String resposta;

		do {
			System.out.println("Existem dois dogs, pita e repita, pita morreu quem ficou?");
			resposta = entrada.next();
		} while (resposta.equals("repita"));

		System.out.println("Entendeu né");

		byte dia;

		do {
			System.out.println("Informe o dia do seu aniver");
			dia = entrada.nextByte();
		} while (dia > 31);
		System.out.println("Espero que não tenha errado muito");

		byte mes;
		byte contador = 0;

		do {
			System.out.println("Informe o dia do seu aneversário ex(1 até 31)");
			dia = entrada.nextByte();

			System.out.println("Informe o mes do seu aniversário ex(1 até 12)");
			mes = entrada.nextByte();
			contador++;

		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);

		System.out.println("Finalmen te vc digitou certo " + dia + "/" + mes + --contador);

		main(null);
	}

}
