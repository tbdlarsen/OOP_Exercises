public class Point2D {

    //instance variables
    int x;
    int y;

    //contructor
    Point2D(int x, int y){
        this.x = x;
        this.y = y;

    }

    //method for creating the values of point
    public static Point2D create(int x, int y){
        return new Point2D(x, y);
    }

    //euclidian distance to another 2d point
    public double distance(Point2D p){

        //calculate difference in x and y
        //doesnt need to be abs value since they are square later
        int diffX = p.x-this.x;
        int diffY = p.y-this.y;

        //returns euclidian distance
        return Math.sqrt((diffX*diffX)+(diffY*diffY));

    }



    //methods for getting the values of specific point
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }



}