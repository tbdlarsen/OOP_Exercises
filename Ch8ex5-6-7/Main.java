public class Main{

    public static void main(String[] args) {

        //create and set values for two random points
        Point2D point0 = Point2D.create(2, 5);
        Point2D point1 = Point2D.create(4, 6);
        
        //print test to see if methods work correctly
        System.out.println("value of x: " + point0.getX() + " value of y: " + point0.getY());
        System.out.println("distance between point 0 and 1: " + point1.distance(point0));

        
    }



}