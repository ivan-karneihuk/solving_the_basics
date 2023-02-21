public class line4 {
    public static void main(String[] args) {
        Double startNum = 111.222;
        Integer numInt = startNum.intValue();
        Double numDouble = startNum;
        startNum = startNum * 1000;
        numDouble = startNum - numInt * 1000;
        startNum = numDouble + numInt.doubleValue() / 1000;
        System.out.println(startNum);
    }
}
