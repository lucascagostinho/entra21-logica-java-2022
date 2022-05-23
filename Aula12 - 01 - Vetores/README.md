# Array  [ ]
 
> An array in Java is a group of like-typed variables referred to by a common name.An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the definition of the array. 
 
 > - In Java, all arrays are dynamically allocated;
 > - Since arrays are objects in Java, we can find their length using the object property length;
 > - A Java array variable can also be declared like other variables with [] after the data type;
 > - The variables in the array are ordered, and each has an index beginning from 0.
 > - Java array can be also be used as a static field, a local variable, or a method parameter.
 > - The size of an array must be specified by int or short value and not long.
 > - The direct superclass of an array type is Object.

<br>

<br>

## Creating, Initializing, and Accessing an Array 

### One-Dimensional Arrays: 

> - Declaration:

```java
type var-name[];
 // OR
type[] var-name;
```

> -An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold. 

> - Example: 

```java
// both are valid declarations
int intArray[]; 
or int[] intArray; 
byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];
```

>> Although the first declaration establishes that intArray is an array variable, no actual array exists. It merely tells the compiler that this variable (intArray) will hold an array of the integer type. To link intArray with an actual, physical array of integers, you must allocate one using new and assign it to intArray.
<br>

> - Instantiating an Array in Java :

> - When an array is declared, only a reference of an array is created. To create or give memory to the array, you create an array like this: The general form of new as it applies to one-dimensional arrays appears as follows:

```java
var-name = new type [size];
```
> - Here, type specifies the type of data being allocated, size determines the number of elements in the array, and var-name is the name of the array variable that is linked to the array. To use new to allocate an array, you must specify the type and number of elements to allocate.

```java
int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
// or
int[] intArray = new int[20]; // combining both statements in one
```

>> The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types). Refer Default array values in Java
Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.
<br>

- Array Literal
  
> - In a situation where the size of the array and variables of the array are already known, array literals can be used.

```java
 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal
```

<br>

- Accessing Java Array Elements using for Loop  🔁

> - Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size)-1. All the elements of array can be accessed using Java for Loop.

```java
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
  System.out.println("Element at index " + i + " : "+ arr[i]);
```
