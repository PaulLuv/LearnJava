package memoryexc;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆内存溢出
 * @author paulluv
 * 需要配置堆内存大罪数，限制堆内存扩展
 */
public class HeapMemoryExt {
    static class OOMObject{

    }

    public static void main(String[] arg){
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
