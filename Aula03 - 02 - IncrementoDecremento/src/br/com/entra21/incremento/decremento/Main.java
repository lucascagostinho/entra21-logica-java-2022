package br.com.entra21.incremento.decremento;

public class Main {

	public static void main(String[] args) {

		int idade = 33;

		//idade = idade + 1;// 34

		//idade++;// 35 idade = idade + 1

		//idade += 2;// 37 idade = idade + 2

		//idade *= 2;// 74 idade = idade * 2
		
		//idade--;// 73 idade = idade - 1
		
		//idade-= 10;// idade = idade - 10
		
		System.out.println("Incremento antes da execu��o:" + idade++); //Idade ir� ser 33, pois dessa forma, ele s� vai por +1, na proxima linha
		System.out.println("Incremento antes da execu��o:" + (++idade)); //Idade ir� ser 34, pois dessa forma, ele vai for�ar a fazer a soma na linha
		System.out.println("Incremento antes da execu��o:" + idade--); //Idade ir� ser 33, pois dessa forma, ele s� vai por -1, na proxima linha
		System.out.println("Incremento antes da execu��o:" + (--idade)); //Idade ir� ser 32, pois dessa forma, ele vai for�ar a fazer a subtra��o na linha

	}

}
