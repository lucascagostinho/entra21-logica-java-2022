package br.com.entra21.prova.questao.dois;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		calculator();

	}

	public static void calculator() {
		String option;
		float numA, numB;
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a operação que deseja realizar: ");
		System.out.println("1 - Soma \n 2 - Subtraca \n 3 - Divisao \n 4 - Multiplicacao \n 0 - Fechar");
		option = input.next();

		System.out.println("Digite o primeiro número :");
		numA = input.nextFloat();

		System.out.println("Digite o segundo número:");
		numB = input.nextFloat();

		switch (option.toLowerCase()) {
		case "1":
		case "soma":
			System.out.println("O resultado da soma  entre " + numA + " e " + numB + " é " + sum(numA, numB));
			newCalc();
			break;
		case "2":
		case "subtracao":
			System.out.println(
					"O resultado da subtração  entre " + numA + " e " + numB + " é " + subtraction(numA, numB));
			newCalc();
			break;
		case "3":
		case "divisao":
			System.out.println("O resultado da divisão  entre " + numA + " e " + numB + " é " + div(numA, numB));
			newCalc();
			break;
		case "4":
		case "multiplicacao":
			System.out.println(
					"O resultado da subtração  entre " + numA + " e " + numB + " é " + multiplication(numA, numB));
			newCalc();
			break;
		case "0":
		case "encerrar":
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Digite uma opção válida.");
			calculator();
			break;
		}
	}

	public static float sum(float numA, float numB) {
		return numA + numB;
	}

	public static float subtraction(float numA, float numB) {
		return numA - numB;
	}
	
	public static float multiplication(float numA, float numB) {
		return numA * numB;
	}

	public static float div(float numA, float numB) {
		return numA / numB;
	}

	public static void newCalc() {
		Scanner input = new Scanner(System.in);
		String option, newCalc;

		System.out.println("Deseja realizar um novo cáculo? \n 1 - Sim \n 2 - Nao");
		newCalc = input.nextLine();
		newCalc = newCalc.toLowerCase();

		switch (newCalc) {
		case "1":
		case "sim":
			calculator();
			break;
		case "2":
		case "nao":
			System.out.println("Finalizando programa");
			break;
		default:
			System.out.println("Resposta Invalida!\n Programa irá finalizar");
			break;
		}
	}

}