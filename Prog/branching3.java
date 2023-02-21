import javafx.scene.effect.Light.Point;

public class branching3 {
    public static void main(String[] args) {
        Point a = new Point(1, 1, 0, null);
        Point b = new Point(2, 2, 0, null);
        Point c = new Point(3, 3, 0, null);
        double v = a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() -
                a.getY())
                + c.getX() * (a.getY() - b.getY());
        if (v == 0.0) {
            System.out.println("точки лежат на одной прямой");
        } else {
            System.out.println("точки не лежат на одной прямой");
        }
    }
}