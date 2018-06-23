package reference;

import java.lang.ref.WeakReference;

/**
 * @author paulluv
 *
 * 弱引用: 垃圾回收时，弱引用关联的对象会被回收。
 */
public class WeakReferenceClass {

    private WeakReference<WeakReferenceClass> weakInstancenew  = new WeakReference(this);

}
