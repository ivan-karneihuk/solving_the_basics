public class line3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Double rez = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) *
                Math.tan(x * y);
        System.out.println(rez);
    }
}
