public class branching1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int c = 1;
        if (x == 0 || y == 0 || c == 0 || x >= 180 || y >= 180 || c >= 180) {
            System.out.println("Треугольк не существует");
        } else if (x == 90 || y == 90 || c == 90) {
            System.out.println("треугольк прямоугольный");
        } else {
            System.out.println("треугольк существует");
        }
    }
}
