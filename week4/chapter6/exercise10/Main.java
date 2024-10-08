public class Main {
    public int x = 10;
    public int y = 20;

    public void printY() {
        if (x == 10){
            y++;
            System.out.println("y = " + y);
        }else {
            y--;
            System.out.println("y = " + y);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printY();
        
       
    }


}