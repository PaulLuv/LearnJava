package reference;

/**
 * @author paulluv
 *
 * 强引用: 一般的引用，强引用关联的对象不会被系统回收，即使内存不足，系统会发生溢出也不会回收该对象。
 */
public class StrongReferenceClass {

    public static void main(String[] arg){
        Object object = new Object();
    }
}
