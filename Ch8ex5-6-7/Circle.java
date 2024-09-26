public class Circle{
    
    private int y;
    private double radius;
    private int x;

    Circle(int x_in,int y_in,double radius_in) {
        x = x_in;
        y = y_in;
        radius = radius_in;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
}