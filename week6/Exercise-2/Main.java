
public class Main {

    public void rounder() {
        try {
            int x = 100 / 0;
        } catch (ArithmeticException e) {
            String errorMessage = e.getLocalizedMessage();
            System.out.println(errorMessage);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.rounder();
        
    }

}
