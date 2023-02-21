public class branching2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int i = 4;
        int result1 = a < b ? a : b;
        int result2 = c < i ? c : i;
        if (result1 < result2) {
            System.out.print(result2);
        } else {
            System.out.print(result1);
        }
    }
}
