public class Point {
  private double x, y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    double xD = x - other.x;
    double yD = y - other.y;
    return Math.sqrt(xD * xD + yD * yD);
  }

  public boolean equals(Point other) {
    return (x == other.x && y == other.y);
  }


}
