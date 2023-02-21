public class cycle8 {
    public static void main(String[] args) {
        int a = 14345;
        int x = 45678;
        String srt1 = String.valueOf(a);
        String srt2 = String.valueOf(x);
        String result = "";
        for (int i = 0; i < srt1.length(); i++) {
            for (int j = 0; j < srt2.length(); j++) {
                if (srt1.charAt(i) == srt2.charAt(j)) {
                    result += srt2.charAt(j);
                }
            }
        }
        System.out.println(result);
    }
}
