public class Employee {
String name;
boolean retired;
double salary;
public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.name);
        System.out.println(emp.retired);
        System.out.println(emp.salary);
    }


}

// output is null, false, 0.0, since the instance variables are not given a value when created