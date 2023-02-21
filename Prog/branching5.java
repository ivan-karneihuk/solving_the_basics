public class branching5 {
    public static void main(String[] args) {
        double f;
        double x = 2;
        if (x <= 3) {
            f = x * x - 3 * x + 9;
        } else {
            f = 1 / ((Math.pow(x, 3)) + 6);
        }
        System.out.println(f);
    }
}