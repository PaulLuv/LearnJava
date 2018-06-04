package initclass;

/**
 * 几种不会触发类的初始化的示例
 *      1.通过子类引用父类的静态字段，不会导致子类的初始化。（父类的初始化在子类的前面，虚拟机并未明确规定对于这一情况是否要触发子类的加载与验证）
 *      2. 通过定义数组类引用类，不会触发类的初始化。
 *      3. final修饰的常量。（常量在编译阶段会存入调用类的常量池中，本质上没有引用到定义类的常量，因此不会触发定义常量的类的初始化）
 *
 * @author Paul Luv
 * @date 2018.06.04
 */
public class InitClassTest {
    public static void main(String[] arg){
//        System.out.println(SubClass.value);
        SuperClass[] sca = new SuperClass[10];
    }
}
