public class PointTester {
  public static void main(String[] args) {
    /*
    Point t1 = new Point(3, 4);
    System.out.println(t1.getX());

    Point t2 = new Point(0, 0);
    System.out.println(t1.distanceTo(t2));

    Point t3 = new Point(0,0);
    System.out.println(t3.equals(t2));
    System.out.println(t3.equals(t1));
    */

    //scalene
    Point t1 = new Point(0, 4);
    Point t2 = new Point(0, 0);
    Point t3 = new Point(3, 0);
    Triangle yay = new Triangle(t1, t2, t3);
    System.out.println(yay.getPerimeter());//12
    System.out.println(yay.getArea());//6
    System.out.println(yay.classify()); //scalene
    System.out.println(yay);

    Point t4 = new Point(5, 2);
    yay.setVertex(2, t4);
  //  System.out.println(yay.getPerimeter());//
  //  System.out.println(yay.getArea());//
  //  System.out.println(yay.classify()); //isosceles
    System.out.println(yay);
    yay.setVertex(0, t4);
    yay.setVertex(1, t4);
    System.out.println(yay);
    System.out.println(yay.classify());



  }
}
