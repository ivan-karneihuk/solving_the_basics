public class line5 {
    public static void main(String[] args) {
        int sec = 9000;
        int min = sec / 60;
        int hour = min / 60;
        System.out.println(hour + " " + min % 60 + " " + sec % 60);
    }
}
