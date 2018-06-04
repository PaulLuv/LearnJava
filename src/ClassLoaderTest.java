import java.util.List;
/**
 * Java 类加载器的示例
 * @author paulluv
 * @date 2018.06.02
 */
public class ClassLoaderTest {
    public static void main(String[] args){
        System.out.println("ClassLoaderTest类的加载器的名称：" + ClassLoaderTest.class.getClassLoader().getClass().getName());

        System.out.println("System类的加载器的名称：" + System.class.getClassLoader());

        System.out.println("String类的加载器的名称：" + String.class.getClassLoader());

        System.out.println("List类的加载器的名称：" + List.class.getClassLoader());

        ClassLoader cl = ClassLoaderTest.class.getClassLoader();

        while (cl != null){
            System.out.print(cl.getClass().getName() + " -> ");
            cl = cl.getParent();
        }
        System.out.print(cl);
    }
}