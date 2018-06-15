package volatilelearn;

public class VolatileLearn1{
    public int count = 0;

    public synchronized void add(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        count++;
    }
}