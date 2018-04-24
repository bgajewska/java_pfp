package ru.stqa.pft.sandbox;

public class Point {


  public static void main(String[] args) {


    private double x;
    private double y;

  public Point( double x, double y){
      this.x = x;
      this.y = y;
    }
  }
  public static double distance(Point p1, Point p2) {


    double dx;
    double dy;
    dx = p2.x - p1.x;
    dy = p2.y - p1.y;

    System.out.println("dlugosc odcinka o współrzędnych" + p1.x + p1.y + " oraz " + p2.x + p2.y + " wynosi " + distance );

    return Math.sqrt((dx * dx) + (dy * dy));




}

}
