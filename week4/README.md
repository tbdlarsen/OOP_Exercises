The list of all the exercises for week 4 can be found in this file.

# Ch4Ex7 
consider the folowing two variable declarations.

byte small = 10;
int big = 99;

how will you assign the value of big to the value of small?

# Ch4Ex11 
Can you cast a boolean value to an int type, as shown in the following
statement?

boolean done = true;
int x = (int) done;

What happens when you compile this snippet of code?

# Ch4Ex12
are the boolean literals true and false the same as integers 1 and 0?

# Ch5Ex8
Consider the following snippet of code:

int x = 23;
x = x++ % x;

What will be the value of x after this snippet of code is executed? explain your
answer with steps performed explaining how the value of x changes during the
execution of the second statement

# Ch5Ex9
explain why the following snippet of code does not compile:

int x = 10;
boolean yes = (x = 20);

# Ch5Ex10
What will be the value assigned to the variable named yes when the following
snippet of code is executed?

int x = 10;
boolean yes = (x == 20);

# Ch5Ex13
What will be the output when the following snippet of code is executed?

boolean b = true;
String str = !b +" is not " + b;
System.out.println(str);

# Ch5Ex16
Complete the second statement using the ternary operator (? :) and the bitwise
aND operator (&) that will make a message "x is odd". Your code must contain
the following tokens in any order: x, &,==, ?, :, "odd", and "even". You may use
additional tokens as needed:

int x = 19;
String msg = your-code-goes-here ;
System.out.println("x is " + msg);

# Ch6Ex10
Fix the compile-time errors in the following snippet of code. make sure the fixed
code prints the value of y:

int x = 10;
int y = 20;
if (x = 10)
    y++;
    System.out.println("y = " + y);
else
    y--;
    System.out.println("y = " + y);

# Ch6Ex11
rewrite the following snippet of code using an if-else statement. make sure
that the switch and if-else statements both have the same output when you
initialize the variable x to another value. (hint: this is a tricky question because
there are no break statements in any case labels.)

int x = 50;
switch (x) {
    case 10:
    System.out.println("Ten");
default:
    System.out.println("No-match");
case 20:
    System.out.println("Twenty");
}

# Ch6Ex15
the intent of the following for statement is to print integers from 1 to 10 in reverse
order. the code does not print the numbers as intended. Identify the logical error
and fix the code, so it prints 10, 9, 8, …1:

for(byte b = 10; b >= 1; b++)
    System.out.println(b);

# Ch6Ex17
Write a snippet of code using a for statement that calculates the sum of all
integers from 1 to 10 and prints it on the standard output. the template for your
code is as follows:
int sum = 0;
for(<your-code>; <your-code>; <your-code>);
System.out.println("Sum = " + sum);

# Ch6Ex18
Use a nested for statement to print the following pyramid.
   *
  ***
 *****
*******



 
