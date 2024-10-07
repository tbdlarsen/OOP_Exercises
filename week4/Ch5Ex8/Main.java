


public class Main {

    public int x = 23;
    
    public Main(){
        x = x++ % x;


    }
    
    public static void main(String[] args) {
        Main obj = new Main();

       System.out.println(obj.x);
       
    }


}
//the program saves the x value before it is added therefore the calculation is 23 mod 24 which is 23.