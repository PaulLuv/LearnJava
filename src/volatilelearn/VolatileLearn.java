package volatilelearn;

public class VolatileLearn {

    public volatile static int count = 0;

    public static void add(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args){
        for (int i=0; i< 100; i++){
            new Thread(() -> VolatileLearn.add()).start();
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("运行的结果：count =  " + VolatileLearn.count);
        }

    }
}
