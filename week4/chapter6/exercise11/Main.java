public class Main {

    public int x = 50;


    public void matchX (){

        // prints all cases after default statement because there is not break in the switch case from the exercise
        if (x == 10){
            System.out.println("Ten");
        }else {
            System.out.println("No-match");
            System.out.println("Twenty");
        }

    }
 





    public static void main(String[] args) {
        Main obj = new Main();
        obj.matchX();

    }


}