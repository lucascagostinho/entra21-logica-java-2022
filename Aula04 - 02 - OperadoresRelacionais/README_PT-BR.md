# Aprendendo sobre operadores relacionais

## Tipos

> - (<) Para verificar se um valor é menor que outro
> - (>) Para verificar se um valor é maior que outro
> - (<=) Para verificar se um valor é menor ou igual
> - (>=) Para verificar se um valor é maior ou igual

```java
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
```