package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    private static List exceptionArray = new ArrayList();

    public static void main(String[] arg){
        System.out.println(exceptionArray.toArray().length);
        for (int i = 0; i < 13; i++) {
            exceptionArray.add(i);
        }
        System.out.println(exceptionArray.toArray().length);
    }
}
