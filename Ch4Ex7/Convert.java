public class Convert{
    //instance variables
    int big;
    byte small;
    
    //constructor
    Convert(int a, byte b){
    big = a;
    small = b;

    }


    //method
    void update(){
         small = (byte) big;

        System.out.println("set small value to " + small);
    }
}