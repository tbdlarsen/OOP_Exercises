public class Point2D {

    //instance variables
    private int x;
    private int y;


    //setter and getter methods
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
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



}