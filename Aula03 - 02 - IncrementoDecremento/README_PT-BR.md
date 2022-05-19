
# Operadores de Incremento e Decremento

> - Um operador unário de incremento aumenta o valor da variável em um, enquanto o operador unário de decremento diminui o valor da variável em um. O operando requerido deve ser uma variável que não seja constante. Os operadores unários de incremento e decremento têm duas formas, que são prefixo e posfixo.

# Operadores de Pré-Incremento e Pré-Decremento

> - Na forma de prefixo, os operadores unários de incremento e decremento aparecem antes
o operando. Enquanto usamos a forma de prefixo, primeiro atualizamos o valor do operando e depois usamos o novo valor na expressão.

#### Exemplo usando o pré-incremento :

```java
int add = 1;
++add; // add = 2
int number = ++add; // add = 3, number =3
```

#### Exemplo usando o pré-decremento :

```java
int add = 2
-- add; // add = 2
int number = --add; // add = 0, number = 0;
```

# Operadores Pós-Incremento e Pós-Decremento

> - In the postfix form, the operator appears after the operand. While using the postfix form, we first use the value of the operand in the expression and then update it.

#### Exemplo usando o pós-incremento

```java
int add = 1;
add++; // add = 2
int number = add++; // add = 3, number = 2
```

#### Exemplo usando o pós-decremento:

```java
int add = 2;
add--; // add = 1
int number = add--; // add = 0, number= 1
```