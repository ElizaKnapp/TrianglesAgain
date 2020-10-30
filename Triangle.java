public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double semiP = getPerimeter() / 2;
    return Math.sqrt(
    semiP *
    (semiP - v1.distanceTo(v2)) *
    (semiP - v2.distanceTo(v3)) *
    (semiP - v3.distanceTo(v1)));
  }

  public String classify() {
    double dist1 = Math.round(v1.distanceTo(v2) * 10000) / 10000.0;
    double dist2 = Math.round(v2.distanceTo(v3) * 10000) / 10000.0;
    double dist3 = Math.round(v3.distanceTo(v1) * 10000) / 10000.0;
    if (dist1 == dist2 && dist2 == dist3) return "equilateral";
    if (dist1 == dist2 || dist2 == dist3 || dist1 == dist3) return "isosceles";
    else return "scalene";
  }

  public String toString() {
    return "v1" + v1 + " v2" + v2 + " v3" + v3;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) v1 = newP;
    if (index == 1) v2 = newP;
    if (index == 2) v3 = newP;
  }

}
