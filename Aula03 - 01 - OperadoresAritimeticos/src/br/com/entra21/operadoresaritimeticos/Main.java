package br.com.entra21.operadoresaritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println(1 + 7);
		System.out.println("Soma " + (1 + 7));

		int numA, numB, soma, subtracao, multiplicacao, resto;
		
		double divisao;

		// objeto entrada da classe scanner precisa utilizar o system.in para ter acesso
		// ao teclado
		Scanner entrada = new Scanner(System.in);// new scanner significa contrua um objeto da classe scanner e atribua
													// na variavel entrada

		System.out.println("Informe o primeiro número: ");
		numA = entrada.nextInt();

		System.out.println("Informe o segundo núemro: ");
		numB = entrada.nextInt();
		
		soma = numA + numB;
		subtracao = numA - numB;
		multiplicacao = numA * numB;
		divisao = numA / numB;	
		resto = numA % numB;

		System.out.println("Soma dos dois números " + (numA + numB));
		System.out.println("Subtração dos dois números " + (numA - numB));
		System.out.println("Multiplicação dos dois números " + (numA * numB));
		System.out.println("Divisão dos dois números " + (numA / numB));
		System.out.println("Resto dos dois números " + (numA % numB));
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println(resto);
		
		

	}

}
