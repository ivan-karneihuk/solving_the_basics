import java.math.BigInteger;

import javafx.scene.effect.Light.Point;

public class branching4 {
    public static void main(String[] args) {
        Point otverstie = new Point(1, 1, 0, null);
        Point kirpith = new Point(1, 2, 2, null);
        if ((otverstie.getX() * otverstie.getY()) < (kirpith.getX() * kirpith.getY())
                &&
                (otverstie.getX() * otverstie.getY()) < (kirpith.getX() * kirpith.getZ()) &&
                (otverstie.getX()
                        * otverstie.getY()) < (kirpith.getY() * kirpith.getZ())) {
            System.out.println("Не войдет");
        } else {
            System.out.println("Войдет");
        }
    }
}
