public class Main{

    public static void main(String[] args) {

        //create and set values for two random points
        Point2D point0 = new Point2D();
        
        point0.setX(2);
        point0.setY(5);

        Point2D point1 = new Point2D();
        point1.setX(1);
        point1.setY(2);



        //print test to see if methods work correctly
        System.out.println("value of x: " + point0.getX() + " value of y: " + point0.getY());
        System.out.println("distance between point 0 and 1: " + point1.distance(point0));

        
    }



}