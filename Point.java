public class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(x: %d, y: %d)", x, y);
    }
    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        return x == p.x && y == p.y;
    }
    
}
