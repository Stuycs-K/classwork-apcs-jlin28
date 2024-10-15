public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    // point a get x minus point b get x squared
    // point a get y minus point b get y squared
  }

  public static void main(String[]args){
    double midpoint;
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p3);
    System.out.println(p3 + " = " + p4);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    //start of equilateral triangle
    Point a = new Point(0,0);
    Point b = new Point(0,1);
    Point c;
    if (a.getX() != b.getX()) {
      midpoint = (a.getX() + b.getX())/2.0;
      c = new Point(midpoint, midpoint * Math.sqrt(3));
    }
    else {
      midpoint = (a.getY() + b.getY())/2.0;
      c = new Point(midpoint * Math.sqrt(3), midpoint);
    }
    System.out.println("\nThe distances between each point is: ");
    System.out.println(distance(a,b) + " a -- b");
    System.out.println(Point.distance(b,c) + " b -- c");
    System.out.println(a.distanceTo(c) + " a -- c");
    System.out.println(c + " are the coordinates of point C");
  }
}
