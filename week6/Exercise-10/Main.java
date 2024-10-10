public class Main{

    public int x = 10;
    public void xCompare(){
        assert (x < 10) : "x must be greater than 10.";

    }



    public static void main(String[] args) {
        Main obj = new Main();
        obj.xCompare();

    }



}