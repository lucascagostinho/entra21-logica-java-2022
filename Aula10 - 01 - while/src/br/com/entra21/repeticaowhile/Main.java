package br.com.entra21.repeticaowhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("1 - while \n2 - do-while \n 0 - Sair");
		System.out.println("Escolha uma op��o");
		// instanciando um objeto da classe Scanner e j� utilizando o metodo next
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
			System.out.println("Op��o inv�lida");
			main(null);
			break;
		}

	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender o while aqui");

		byte contagem = 1;

		while (contagem <= 10) {// condi��o de permanencia /// enquanto contagem for menor ou igual a 10 execute
			System.out.println("contando " + contagem);
			contagem++;
		}
		// para fazer uma repeti��o com base em quantidade � gerado muito c�digo
		System.out.println("Acabei");

		Scanner enetrada = new Scanner(System.in);

		System.out.println("Deseja iniciar uma repeti��o");
		String resposta = enetrada.next();
		// responta pode poder entrar ou n�o entrar
		while (resposta.equalsIgnoreCase("continuar") || resposta.equals("sim")) {
			System.out.println("Voce respondeu: " + resposta);
			System.out.println("Deseja continuar?");
			// resposta que saia ou permance
			resposta = enetrada.next();
			// enquanto a resposta for sim ou continuar, ele vai repitir o escopo do while
			// caso ele digite algo diferente, ele sai do escopo

		}

		System.out.println("Terminou meu while com base em decis��o");

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

		System.out.println("Entendeu n�");

		byte dia;

		do {
			System.out.println("Informe o dia do seu aniver");
			dia = entrada.nextByte();
		} while (dia > 31);
		System.out.println("Espero que n�o tenha errado muito");

		byte mes;
		byte contador = 0;

		do {
			System.out.println("Informe o dia do seu anevers�rio ex(1 at� 31)");
			dia = entrada.nextByte();

			System.out.println("Informe o mes do seu anivers�rio ex(1 at� 12)");
			mes = entrada.nextByte();
			contador++;

		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12);

		System.out.println("Finalmen te vc digitou certo " + dia + "/" + mes + --contador);

		main(null);
	}

}
