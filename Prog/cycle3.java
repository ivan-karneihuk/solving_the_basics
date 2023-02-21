public class cycle3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
