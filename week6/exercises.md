# Exercise 1 

a.
try {
    int x = 100 / y;
    int[] es = new int[n];
    e = es[Math.round(x)];
} catch (ArithmeticException e1) {
    ...
} catch (NegativeArraySizeException e2) {
    ...
} catch (java.util.NoSuchElementException e3) {
    ...
}

b.

try {
    int x = 100 / y;
    int[] es = new int[n];
    e = es[Math.round(x)];
} catch (Exception e) {
    ...
}

Which one would you use? JusIfy your answer.

# Exercise 2

Complete the following snippet of code, so
the error message associated with the excepIon is printed on the standard output:

try {
    int x = 100 / 0;
} catch (ArithmeticException e) {
    String errorMessage = e./* You code goes here */;
    System.out.println(errorMessage);
}

# Exercise 3 
Describe the reason why the following try-
catch block does not compile:

try {
    // The following statement throws NumberFormatException
    int luckNumber = Integer.parseInt("Hello");
} catch (Exception e) {
    // Handle the exception here
} catch (NumberFormatException e) {
    // Handle the exception here
}

# Exercise 4
Consider the following class:

class Point2D {
        private int x;
        private int y;
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
        public int getY() {
        return this.y;
    }
    public double distance(Point2D p) {
        int temp1 = this.x - p.x;
        int temp2 = this.y - p.y;
        return Math.sqrt((temp1*temp1)+(temp2*temp2));
    }
    public static Point2D create(int x, int y) {
        Point2D p = new Point2D();
        p.setX(x);
        p.setY(y);
        return p;
    }
}

Add a main method to this class that creates an instance of Point2D and invoke its methods.
Make sure that running the class Point2D throws an excepIon when invoking one of the
instance methods of the class. NoIce that in this exercise you can’t modify the code of the
instance methods in the class, the only change in the class is the addiIon of a main method.

# Exercise 5 
Modify the method that threw an excepIon when you executed your class Point2D (from
the previous task). Add an appropriate throws clause to the method and code that
handles the excepIon in the main method. NoIce that in this exercise you can’t modify
the code of the instance methods in the class, the only change in the instance methods is
the addiIon of a throws clause in the method declaraIon (before the body of the
method).

# Exercise 6
Create a class that is a subtype of java.lang.ExcepIon. This new type will represent the
abnormal condiIon “aZempIng to create a circle with a negaIve radius”. Decide if this
class should be a subtype of java.lang.RunImeExcepIon. Modify the constructor of the
class Circle (available at Circle.java) to throw an instance of the class you have created
when the abnormal condiIon arises.

# Exercise 7
For each of the methods in the class given the previous task, idenIfy if they could throw
an excepIon.

# Exercise 8
Add code to the class CircleCollecIon (available at CircleCollecIon.java) to handle the
excepIons that could be thrown from the constructor or the methods of Circle.

# Exercise 9 
econsider your soluIon to the previous task. IdenIfy (in your modified
CircleCollecIon.java file) other statements that could throw an excepIon. Add appropriate
excepIon handling to CircleCollecIon to avoid that those excepIons that you idenIfied
are handled by the Java runIme.

# Exercise 10 
Complete the assert statement in the
following snippet of code assuming that x must be greater than 10:

int x = getValue();
assert /* Your code goes here */ : "x must be greater than 10.";

# Exercise 11 
You are wriIng code for a public method, and
you want to validate the method's arguments. Will you use asserIon or excepIon to
achieve it? Describe your response.

# Exercise 12
Add assertions to the class Item (available at Item.java) that would detect problems in the
implementaIon of the instance methods of the class. Create a main method that invokes
some of the instance methods of the class Item so that the class can be run, and no errors
are found. Modify your main method so that at least one error is found
