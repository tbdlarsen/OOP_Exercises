public class Convert{
    int big;
    byte small;
    
    
    Convert(int a, byte b){
    big = a;
    small = b;

    }

    void update(){
         small = (byte) big;

        System.out.println("set small value to " + small);
    }
}