package initclass;

/**
 * 几种不会触发类的初始化的示例
 * @author Paul Luv
 * @date 2018.06.04
 */
public class InitClassTest {
    public static void main(String[] arg){
//        System.out.println(SubClass.value);
        SuperClass[] sca = new SuperClass[10];
    }
}
