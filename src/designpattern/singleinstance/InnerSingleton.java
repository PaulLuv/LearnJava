package designpattern.singleinstance;

/**
 * @author paulluv
 *
 * 静态内部类的单例
 *
 * 1. JVM本身保证线程安全
 * 2. 延迟加载，外部类的加载不影响内部类的加载，只有真正调用getInstance方法的时候，内部类才会加载。
 */
public final class InnerSingleton {

    private InnerSingleton(){

    }

    private static final class InnerSingletonHolder{
        static final InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return InnerSingletonHolder.instance;
    }

}
