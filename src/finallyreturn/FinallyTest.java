package finallyreturn;

/**
 * @author paulluv
 *
 * try catch finally return
 */
public class FinallyTest {

    private static int[] array = new int[3];

    public static void main(String[] args){
        System.out.println(getInt1());
        System.out.println(getInt2());
    }

    static int getInt1(){
        try{
            array[3] = 0;
            return 0;
        }catch (ArrayIndexOutOfBoundsException e){
            e.fillInStackTrace();
            return 1;
        }finally {
        }
    }

    static int getInt2(){
        try{
            array[3] = 0;
            return 0;
        }catch (ArrayIndexOutOfBoundsException e){
            e.fillInStackTrace();
            return 1;
        }finally {
            return 2;
        }
    }
}
