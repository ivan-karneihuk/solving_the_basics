import java.util.Scanner;

public class cycle6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int code = str.codePointAt(i);
            System.out.println(code);
        }
    }
}
