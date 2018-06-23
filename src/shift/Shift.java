package shift;

/**
 * @author paulluv
 *
 * Shift 移位操作
 *
 * 移位在计算机中是比较快的。
 *
 * >> 右移， 除法， 二进制右移1位相当于除以2；
 * << 左移， 乘法， 二进制左移1位相当于乘以2.
 */
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
