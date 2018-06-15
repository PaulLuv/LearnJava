package volatilelearn;

public class VolatileLearn {

    public static int count = 0;

    public static void add(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args){

        VolatileLearn1 learn1 = new VolatileLearn1();
        VolatileLearn2 learn2 = new VolatileLearn2();

        for (int i=0; i< 1000; i++){

            new Thread(() -> {
                VolatileLearn.add();
                learn1.add();
                learn2.add();
            }).start();
        }
        try {
            Thread.sleep(50000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("运行的结果：count =  " + VolatileLearn.count);
            System.out.println("同步后运行的结果：count =  " + learn1.count);
            System.out.println("同步后运行的结果：count =  " + learn2.count);
        }

//        while (Thread.activeCount() > 1){ //保证前面的线程都执行完
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
        System.out.println("运行的结果：count =  " + VolatileLearn.count);
        System.out.println("同步后运行的结果：count =  " + learn1.count);
        System.out.println("同步后运行的结果：count =  " + learn2.count);

    }

}
