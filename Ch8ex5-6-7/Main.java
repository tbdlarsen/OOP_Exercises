public class Main{

    public static void main(String[] args) {
        Point2D point0 = new Point2D();
        
        point0.setX(2);
        point0.setY(5);
        System.out.println("value of x: " + point0.getX() + " value of y: " + point0.getY());

        Point2D point1 = new Point2D();
        point1.setX(1);
        point1.setY(2);
        
        System.out.println("distance between point 0 and 1: " + point1.distance(point0));

        
    }



}