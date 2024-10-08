public class Main{

    public void pyramidPrinter(){
        int layers = 4;

        for (int i = 0; i < layers; i++) {
            
            for (int j = i; j < layers; j++) {
                System.out.print("a");
            }
            

            System.out.println(" ");
            
            
        }


    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.pyramidPrinter();
    }

} 
