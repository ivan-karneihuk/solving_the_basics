import java.math.BigInteger;

public class cycle4 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        String str;
        for (int i = 1; i <= 200; i++) {
            // int num = Integer.getInteger(String.valueOf(Math.pow(i, 2)));
            // System.out.println(num);
            str = String.valueOf(((Double) Math.pow(i, 2)).intValue());
            BigInteger tmp = new BigInteger(str);
            result = result.multiply(tmp);
        }
        System.out.println(result);
    }
}
