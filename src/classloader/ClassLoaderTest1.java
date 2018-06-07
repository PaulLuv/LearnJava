package classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * 覆盖loadClass示例
 *
 * 本示例中 存在两个ClassLoaderTest1，一个是由
 * @author paulluv
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) throws Exception{
        ClassLoader myLoder = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null){
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                }catch (IOException e){
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myLoder.loadClass("classloader.ClassLoaderTest1").newInstance();

        System.out.println(obj.getClass());
        System.out.println(obj instanceof classloader.ClassLoaderTest1);
    }
}
