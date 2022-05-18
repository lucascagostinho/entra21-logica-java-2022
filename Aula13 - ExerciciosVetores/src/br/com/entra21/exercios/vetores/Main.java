package br.com.entra21.exercios.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println(exibirMenu());

			// utilizando do-while, pois me permite entrar no bloco antes de testar a
			// condição de permanencia
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saiu");
				break;

			case 1:
				exibirTamanhoVetores();
				break;

			case 2:
				exibirTamanhoVetoresInicializados();
				break;

			case 3:
				criarVetorComCinco();
				break;

			case 4:
				criarVetorComTamanhoInformadoPeloUsuario();
				break;

			case 5:
				criarVetorParaPercorrer();
				break;

			case 6:
				criarVetorAteQueOUsuarioNaoQueiraMais();
				break;

			default:
				break;
			}
			// caso a condição de permaneencia seja true, repita o bloco
		} while (option != 0);// enquanto não for zero, repita

	}

	public static String exibirMenu() {
		String menu = "Escolha uma das opções\n";
		menu += "0 - Sair";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu += "5 - Criar um vetor de inteiros inicializado , para percorrer Do inicio ao fim\\r\\n\"\r\n"
				+ "				+ \"Do fim ao inicio\\r\\n\" + \"Para exibir os valores\n";
		menu += "6 - Criar um vetor de inteiros não inicializado Repita indefinidamente até que o usuário responda não para a pergunta\\r\\n\"\r\n"
				+ "						+ \"Gostaria de inicializar o valor de uma das posições entre 1 e TAMANHO?\\r\\n\"\r\n"
				+ "						+ \"Caso responda sim\\r\\n\" + \"Capturar uma posição\\r\\n\"\r\n"
				+ "						+ \"Repetir a captura enquanto o índice não for válido\\r\\n\" + \"Caso responda não\\r\\n\"\r\n"
				+ "						+ \"Sair da repetição de inicializações\\r\\n\" + \"Exibir todos os valores do vetor";

		return menu;
	}

	public static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {

		byte vetorBytes[] = { 1, 2, 3, 4 };
		short vetorShorts[] = { 5, 6, 7, 8 };
		int vetorInts[] = { 9, 10, 11, 12 };
		long vetorLongs[] = { 13, 14, 15, 16 };
		char vetorChars[] = { 'a', 'b', 'c' };
		float vetorFloats[] = { 17, 18, 19, 20 };
		double vetorDoubles[] = { 21, 22, 23 };
		boolean vetorBooleans[] = { true, false };

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);
	}

	public static void criarVetorComCinco() {

		Scanner input = new Scanner(System.in);
		int vetorInts[] = new int[5];

		for (int counter = 1; counter < vetorInts.length; counter++) {
			System.out.println("Infome o valor para armazenar no vetor:");
			vetorInts[counter] = input.nextInt();
			System.out.println("valor informado na posição nº" + counter + " é igual: " + vetorInts[counter]);

		}

	}

	public static void criarVetorComTamanhoInformadoPeloUsuario() {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor que deseja criar: ");
		int vetorInts[] = new int[input.nextInt()];

		for (int counter = 0; counter < vetorInts.length; counter++) {
			System.out.println("Informe o valor que deseeeja alocar na posição nº " + counter);
			vetorInts[counter] = input.nextInt();
			System.out.println("Valor informado na posição nº" + counter + " foi: " + vetorInts[counter]);

		}
	}

	public static void criarVetorParaPercorrer() {

		int vetorInsts[] = { 5, 6, 7, 8 };

		for (int counter = 0; counter < vetorInsts.length; counter++) {
			System.out.println("Posição nº " + counter + "valor: " + vetorInsts[counter]);

		}
		// começando com o valor -1, pois o indice sempre tem um valor a mesnos
		// condição de permanencia, enquanto meu contador for menor que zzeero, pois
		// comecei com o valor altto e vai até o zero
		for (int counter = (vetorInsts.length) - 1; counter >= 0; counter--) {
			System.out.println("Posição nº " + counter + "valor: " + vetorInsts[counter]);
		}

	}

	public static void criarVetorAteQueOUsuarioNaoQueiraMais() {
		{

			byte vetorBytes[] = new byte[10];
			Scanner entrada = new Scanner(System.in);
			String resposta;
			byte index = 0;

			do {
				System.out.println("Informe um valor para o indice [" + index + "]");
				vetorBytes[index] = entrada.nextByte();

				System.out.println("Gostaria de inicializar outro indice?");
				resposta = entrada.next();

				if (resposta.equalsIgnoreCase("sim")) {
					do {
						System.out.println("Informe um indice válido entre 0 e " + (vetorBytes.length - 1));
						index = entrada.nextByte();// Se o usuario digitar um valor valido esse index sera usado no meu
													// DO
													// principal, onde a logica se repete

					} while (index < 0 || index >= vetorBytes.length);// A posicao escolhida nao pode ser menor do que 0
																		// nem
																		// o tamanho do vetor ou superior
					// Exemplo: O range valido é de 0 a 9, qualquer numero alem disso fica preso
					// nesse loop

				}

			} while (resposta.equalsIgnoreCase("sim"));

			for (byte contador = 0; contador < vetorBytes.length; contador++) {

				System.out.println("vetorBytes[" + contador + "] = " + vetorBytes[contador]);

			}

		}

	}
}
