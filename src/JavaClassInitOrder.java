/**
 * Java 类的初始化顺序示例
 * @author paulluv
 * @date 2018.06.01
 */
public class JavaClassInitOrder {
    public static String staticField = "静态变量";
    public String field = "变量";
    static {
        System.out.println( staticField );
        System.out.println( "静态初始化块" );
    }
    /* 初始化块 */
    {
        System.out.println( field );
        System.out.println( "初始化块" );
    }
    /* 构造器 */
    public JavaClassInitOrder() {
        System.out.println( "构造器" );
    }

    public static void main( String[] args ) {
        System.out.println( "main1" );
        new JavaClassInitOrder();
        System.out.println( "main2" );
    }
}
