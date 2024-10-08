public class Main {

    public int sum = 0;

    public void sumCalculator(){
        for (int i = 0; i <= 10; i++){
            sum += i;
        
        }
        System.out.println(sum);
    }




    public static void main(String[] args) {
        Main obj = new Main();
        obj.sumCalculator();


    }



}