# Multidimensional Arrays

> - Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension.

<br>

```java
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```

<br>

- Passing Arrays to Methods:

> - Like variables, we can also pass arrays to methods. For example, the below program passes the array to method sum to calculate the sum of the array’s values.

```java
// Java program to demonstrate
// passing of array to method
 
public class Test
{   
    // Driver method
    public static void main(String args[])
    {
        int arr[] = {3, 1, 2, 5, 4};
         
        // passing array to method m1
        sum(arr);
     
    }
 
    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;
         
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
         
        System.out.println("sum of array values : " + sum);
    }
}
```

The output will be : 

```java
sum of array values : 15
```

<br>

## Array Members
  
<br>  

> The members of an array type are all of the following: 
> - The public final field length, which contains the number of components of the array. Length may be positive or zero;
> - All the members inherited from class Object; the only method of Object that is not inherited is its clone method;
> - The public method clone(), which overrides the clone method in class Object and throws no checked exceptions. 