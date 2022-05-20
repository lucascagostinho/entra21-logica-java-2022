# Matrizes

> - Matrizes multidimensionais são vetores de vetores com cada elemento do vetor contendo a referência de outros vetores. Estes também são conhecidos como vetores irregulares. Uma matriz multidimensional é criada anexando um conjunto de colchetes ([]) por dimensão.

<br>

```java
int[][] intArray = new int[10][20]; 
int[][][] intArray = new int[10][20][10]; 
```

<br>


- Passando Arrays para Métodos:

Assim como as variáveis, também podemos passar arrays para métodos. Por exemplo, o programa abaixo passa o array para o método sum para calcular a soma dos valores do array.

```java

 
public class Test
{   
    
    public static void main(String args[])
    {
        int arr[] = {3, 1, 2, 5, 4};
         
        
        sum(arr);
     
    }
 
    public static void sum(int[] arr)
    {
        
        int sum = 0;
         
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
         
        System.out.println("sum of array values : " + sum);
    }
}
```

A saída será:

```java
sum of array values : 15
```

<br>

## Membros da matriz
  
<br>

> Os membros de um tipo de array são todos os seguintes:
- O comprimento final do campo público, que contém o número de componentes da matriz. O comprimento pode ser positivo ou zero;
- Todos os membros herdados da classe Object; o único método de Object que não é herdado é seu método clone;
- O método público clone(), que substitui o método clone na classe Object e não lança exceções verificadas.