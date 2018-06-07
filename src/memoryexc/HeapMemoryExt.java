package memoryexc;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆内存溢出
 * @author paulluv
 */
public class HeapMemoryExt {
    static class OOMObject{

    }

    public static void main(String[] arg){
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
