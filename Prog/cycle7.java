import java.util.Scanner;

public class cycle7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println();
        if (n < m) {
            for (int i = n; i < m; i++) {
                if (m % i == 0 && n != i) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = m; i < n; i++) {
                if (n % i == 0 && m != i) {
                    System.out.println(i);
                }
            }
        }
    }
}
