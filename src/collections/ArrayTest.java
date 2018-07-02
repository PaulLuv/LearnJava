package collections;

public class ArrayTest {
    private static int[] exceptionArray = new int[12];

    public static void main(String[] arg){
        try {
            for (int i = 0; i < 13; i++) {
                exceptionArray[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
