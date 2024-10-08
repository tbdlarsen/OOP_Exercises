
public class Main {

    public static void main(String[] args) {
        int x = 19;

        //comparing x and 1 in binary, so 10011 and 00001,
        //the and operator only gives 1 if they are equal so it becomes
        // 00001 which is odd. 
        String msg = (x & 1) == 1 ? "odd" : "even";

        //String msg = x % 1 == 1 ? "odd":"even";
        System.out.println("x is " + msg);

    }

}
