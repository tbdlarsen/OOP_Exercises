/**
 * A class Circle that represents a circle in a two dimensional space
 *
 * @author Gabriela Montoya
 * @version 1.3, 2023-10-13
 */
class Circle {

    private final int x;
    private final int y;
    private final double radius;
  
    public Circle (int x, int y, double radius) throws NegativeCircle {
        this.x = x;
        this.y = y;
        

        if (radius < 0 ){
            throw new NegativeCircle("negative circle radius" + radius);
        }
        this.radius = radius;
    }  
  
    public int getX() {
        return this.x;
    }
  
    public int getY() {
        return this.y;
    }
  
    public double centerDistance(Circle other) {
        int temp1 = this.x - other.x;
        int temp2 = this.y - other.y;
        return Math.sqrt((temp1*temp1)+(temp2*temp2));
    }
  
    public double distance(Circle other) {
        return this.centerDistance(other) - this.radius - other.radius;
    }
  
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }  
    public static void main(String[] args) {
       // Circle obj = new Circle(1, 1, -2);
    }
}