package designpattern.singleinstance;

/**
 * @author paulluv
 *
 * 1. final 避免被继承
 * 2. 私有构造，保证不被外部初始化
 * 3. 第一个空判断，可以去除，但synchronized是一个重操作，锁的申请与释放都是比较耗时好资源的，所以加上之后进行性能优化。
 * 4. 第二个空判断，不可以去除，多个线程同时访问时，
 * 5. volatile字段的用处，new Singleton()创建对象可分为三步，
 *      1）给Singleton实例分配内存
 *      2）初始化Singleton构造器
 *      3）将INSTANCE 对象指向分配的内存空间
 *   注意：Java会对指令进行重排序，JVM根据处理器的特性，充分利用多级缓存，多核等进行适当的指令重排序，使程序在保证业务的同时，会重排指令。
 *   简单讲就是上面的顺序不一定是1-2-3，也有可能是1-3-2,如果为1-3-2，当执行完1-3的时候，另一个线程访问getInstance，由于INSTANCE不为null，
 *   直接返回INSTANCE，但由于2还没有执行完，此时INSTANCE还是没有完全构造好，导致出错。
 *
 */
public final class Singleton {

    private static volatile Singleton INSTANCE = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
