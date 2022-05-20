# Logical Operators

> These operators are used to perform logical “AND”, “OR” and “NOT” operation. They are used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration. One thing to keep in mind is the second condition is not evaluated if the first one is false.
<br>

## Types

>‘Logical AND’ Operator(&&): This operator returns true when both the conditions under consideration are satisfied or are true. If even one of the two yields false, the operator results false.
Syntax:

```java
condition1 && condition2
```
>Truth Table
| A | B | RESULT|
|:-:|:-:|:-----:|
| T | T |   T	|
| T | F |   F	|
| F | T |   F	|
| F | F |   F	|

Example:

```java
public static void main(String[] args){
        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;
  
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
  
        // using logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
```
<br>

> 'Logical OR' Operator(||): This operator returns true when one of the two conditions under consideration are satisfied or are true. If even one of the two yields true, the operator results true. To make the result false, both the constraints need to return false.
Syntax:

```java
condition1 || condition2
```

>Truth Table
| A | B | RESULT|
|:-:|:-:|:-----:|
| T | T |   T	|
| T | F |   T	|
| F | T |   T	|
| F | F |   F	|

Example:

```java
public static void main(String[] args){
        // initializing variables
        int a = 10, b = 1, c = 10, d = 30;
  
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println("Var4 = " + d);
  
        // using logical OR to verify
        // two constraints
        if (a > b || c == d)
            System.out.println("One or both" + " the conditions are true");
        else
            System.out.println("Both the"+ " conditions are false");
    }
```
<br>

>'Logical NOT' Operator(!): Unlike the previous two, this is a unary operator and returns true when the condition under consideration is not satisfied or is a false condition. Basically, if the condition is false, the operation returns true and when the condition is true, the operation returns false.
Syntax:

```java
!(condition)
```
Example:

```java
public static void main(String[] args){
        // initializing variables
        int a = 10, b = 1;
  
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
  
        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
```