public class PointTester {
  public static void main(String[] args) {
    Point t1 = new Point(3, 4);
    System.out.println(t1.getX());

    Point t2 = new Point(0, 0);
    System.out.println(t1.distanceTo(t2));

    Point t3 = new Point(0,0);
    System.out.println(t3.equals(t2));
    System.out.println(t3.equals(t1));
  }
}
