package reference;

import java.lang.ref.SoftReference;

/**
 * @author paulluv
 *
 * 软引用: 一般用于内存敏感的高速缓存。 软引用关联的对象，在垃圾回收时不会立即被回收，但会被列入可回收范围，
 *
 * 如果还是内存不足，进行第二次将会被回收。
 *
 */
public class SoftReferenceClass {

    SoftReference<SoftReferenceClass> softInstance = new SoftReference<>(this);

    public static void main(String[] arg){

    }
}
