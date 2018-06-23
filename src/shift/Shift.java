package shift;

public class Shift {

    private static int a = 100;
    private static int b = 99;
    private static int c = 98;

    public static void main(String[] arg){
        System.out.println("100 >> 2 = " + (a >> 2)); // 25
        System.out.println("99 >> 1 = " + (b>>1)); // 49
        System.out.println("98 >> 1 = " + (c>>1)); // 49
    }

}
