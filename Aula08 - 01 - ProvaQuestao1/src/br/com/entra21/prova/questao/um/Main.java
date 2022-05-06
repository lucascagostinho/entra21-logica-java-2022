package br.com.entra21.prova.questao.um;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		sign();

	}

	public static void sign() {

		String name, sign, option;
		byte day, month = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		name = input.nextLine();

		System.out.println("Digite o dia do seu anivesario: ");
		day = input.nextByte();

		System.out.println("Informe o mês do seu anoversário: ");
		System.out.println(
				" 1 - Janeiro \n 2 - Fevereiro \n 3 - Março \n 4 - Abril \n 5 - Maio \n 6 - Junho \n 7 - Julho \n 8 - Agosto \n 9 - Setembro \n 10 - Outubro \n 11 - Novembro \n 12 - Dezembro ");
		option = input.next();

		switch (option.toLowerCase()) {
		case "1":
		case "janeiro":
			month = 1;
			break;

		case "2":
		case "fevereiro":
			month = 2;
			break;

		case "3":
		case "março":
			month = 3;
			break;

		case "4":
		case "abril":
			month = 4;
			break;

		case "5":
		case "maio":
			month = 5;
			break;

		case "6":
		case "junho":
			month = 6;
			break;

		case "7":
		case "julho":
			month = 7;
			break;

		case "8":
		case "agosto":
			month = 8;
			break;

		case "9":
		case "setembro":
			month = 9;
			break;

		case "10":
		case "outubro":
			month = 10;
			break;

		case "11":
		case "novembro":
			month = 11;
			break;

		case "12":
		case "dezembro":
			month = 12;
			break;

		default:
			System.out.println("Você informou um valor inválido");
		}

		checkDay(month, day);

		sign = checkSign(month, day);

		if (sign == "Opção inválida") {
			System.out.println("Opção inválida");
			sign();
		} else {

			System.out.println(" Nome: " + name + "\n Data de nascimento: " + day + "/" + month + "\n Siguino: " + sign);
		}
	}

	public static String checkSign(byte month, byte day) {

		String sign;

		if (month == 3 && day >= 21 && day <= 31 || month == 4 && day <= 20) {
			sign = "Aries";

		} else if (month == 5 && day >= 21 && day <= 31 || month == 6 && day <= 20) {
			sign = "Gemeos";

		} else if (month == 6 && day >= 21 && day <= 30 || month == 7 && day <= 22) {
			sign = "Cancer";

		} else if (month == 4 && day >= 21 && day <= 30 || month == 5 && day <= 20) {
			sign = "Touro";

		}   else if (month == 7 && day >= 23 && day <= 31 || month == 8 && day <= 22) {
			sign = "Leao";

		} else if (month == 8 && day >= 23 && day <= 31 || month == 9 && day <= 22) {
			sign = "Virgem";

		} else if (month == 9 && day >= 23 && day <= 30 || month == 10 && day <= 22) {
			sign = "Libra";

		} else if (month == 10 && day >= 23 && day <= 31 || month == 11 && day <= 21) {
			sign = "Escorpiao";

		} else if (month == 11 && day >= 22 && day <= 30 || month == 12 && day <= 21) {
			sign = "Sagitário";

		} else if (month == 12 && day >= 22 && day <= 31 || month == 1 && day <= 20) {
			sign = "Capricornio";

		} else if (month == 1 && day >= 21 && day <= 31 || month == 2 && day <= 18) {
			sign = "Aquario";

		} else if (month == 2 && day >= 19 && day <= 29 || month == 3 && day <= 20) {
			sign = "Peixes";

		} else {
			sign = "Opção inválida";
		}

		return sign;
	}

	public static void checkDay(byte month, byte day) {

		final byte DAY_LIMIT_29 = 29;
		final byte DAY_LIMIT_30 = 30;
		final byte DAY_LIMIT_31 = 31;

		if (month == 2 && day > DAY_LIMIT_29) {
			System.out.println("Informe o dia novamnete, pois fevereiro tem no máximo 29 dias.");

		} else if (month == 4 && day > DAY_LIMIT_30) {
			System.out.println("Informe o dia novamnete, pois Abril possui no máximo 30 dias.");

		} else if (month == 6 && day > DAY_LIMIT_30) {
			System.out.println("Informe o dia novamnete, pois Junho possui no máximo 30 dias.");

		} else if (month == 9 && day > DAY_LIMIT_30) {
			System.out.println("Informe o dia novamnete, pois Setembro possui no máximo 30 dias.");

		} else if (month == 11 && day > DAY_LIMIT_30) {
			System.out.println("Informe o dia novamnete, pois Novembro possui no máximo 30 dias.");

		} else if (day > DAY_LIMIT_31) {
			System.out.println("Informe um dia válido, pois um mês tem no máximo 31 dias.");

		} else {
			checkSign(month, day);
		}
	}
}