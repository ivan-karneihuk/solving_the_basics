public class cycle5 {
    public static void main(String[] args) {
        int n = 2;
        double e = 0.024;
        int num = 1;
        double sum = 0;
        while (Math.abs(Math.pow(num, -n)) >= e) {
            sum += Math.pow(num, -n);
            num++;
        }
        System.out.println(sum);
    }
}
