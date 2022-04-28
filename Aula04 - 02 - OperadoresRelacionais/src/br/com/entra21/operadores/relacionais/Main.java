package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {

		System.out.println("Operadores relacionais");

		System.out.println("Menor < ");
		System.out.println("Maior >");

		byte idadeA, idadeB;
		boolean resultado;

		idadeA = 30;
		idadeB = 50;

		resultado = idadeA < idadeB;
		
		System.out.println("Idade A menor que B" + resultado);

		resultado = idadeA > idadeB;
		System.out.println("Idade A maior que B" + resultado);

		resultado = idadeA <= idadeB;
		System.out.println("Idade A menor ou igual que B" + resultado);

		resultado = idadeA >= idadeB;
		System.out.println("Idade A maior ou igual que B" + resultado);
	}

}
