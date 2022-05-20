# The if Statement

>The Java if statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.
```java
    if(condition) {
   // Statements to execute if
   // condition is true
}
```

<br>

# Nested if 

>A nested if is an if statement that is the target of another if or else. Nested if statements mean an if statement inside an if statement.Java allows us to nest if statements within if statements.
```java
    if (condition1) {
   // Executes when condition1 is true
   if (condition2) {
      // Executes when condition2 is true
   }
}