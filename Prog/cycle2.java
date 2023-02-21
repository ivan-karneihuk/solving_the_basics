public class cycle2 {
    public static void main(String[] args) {
        int a = -3;
        int b = 9;
        int h = 2;
        int x, y;
        for (x = a; x <= b; x = x + h) {
            if (x <= 2) {
                y = x;
                System.out.println("При x = " + x + " y = " + y);
            } else {
                y = x * -1;
                System.out.println("При x = " + x + " y = " + y);
            }
        }
    }
}
