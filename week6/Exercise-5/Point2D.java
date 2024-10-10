class Point2D {
        private int x;
        private int y;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public double distance(Point2D p) throws NullPointerException {
        int temp1 = this.x - p.x;
        int temp2 = this.y - p.y;
        return Math.sqrt((temp1*temp1)+(temp2*temp2));
    }

    public static Point2D create(int x, int y) {
        Point2D p = new Point2D();
        p.setX(x);
        p.setY(y);
        return p;
    }
    public static void main(String[] args) {
        Point2D p1 = Point2D.create(1,2);

        try {
            p1.distance(null);
        } catch (NullPointerException e) {
            System.out.println("Caught Nullpointer Exeption" + e.getMessage());
        }


    }
}