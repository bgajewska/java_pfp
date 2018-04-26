package pl.stqa.pft.sandbox;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(3, 5);

        double distance = Point.distance(p1, p2);

        System.out.println("dlugosc odcinka o współrzędnych (" + p1.x + ", " + p1.y + ") oraz (" + p2.x + ", " + p2.y + ") wynosi " + distance);
    }

}
