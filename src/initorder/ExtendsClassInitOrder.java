package initorder;

/**
 * Java继承类的初始化顺序
 * @author paulluv
 */
public class ExtendsClassInitOrder extends Child{
    public static String staticField = "子类-静态变量";
    public String field = "子类-变量";
    static {
        System.out.println( staticField );
        System.out.println( "子类-静态初始化块" );
    }
    /* 初始化块 */
    {
        System.out.println( field );
        System.out.println( "子类-初始化块" );
    }
    /* 构造器 */
    public ExtendsClassInitOrder(){
        System.out.println( "子类-构造器" );
    }

    public static void main(String[] args){
        System.out.println( "子类-main1" );
        new ExtendsClassInitOrder();
        System.out.println( "子类-main2" );
    }
}

class Parent{
    public static String P_staticField = "父父类-静态变量";
    public String P_field = "父父类-变量";
    static {
        System.out.println( P_staticField );
        System.out.println( "父父类-静态初始化块" );
    }
    /* 初始化块 */
    {
        System.out.println( P_field );
        System.out.println( "父父类-初始化块" );
    }
    /* 构造器 */
    public Parent() {
        System.out.println( "父父类-构造器" );
    }
}

class Child extends Parent{
    public static String C_staticField = "父类-静态变量";
    public String C_field = "父类-变量";
    static {
        System.out.println( C_staticField );
        System.out.println( "父类-静态初始化块" );
    }
    /* 初始化块 */
    {
        System.out.println( C_field );
        System.out.println( "父类-初始化块" );
    }
    /* 构造器 */
    public Child() {
        System.out.println( "父类-构造器" );
    }
}
