public class LargeTask implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is sleeping for 3 sec");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println("Thread was intrupted");
        }
        System.out.println(Thread.currentThread().getName()+" has finished sleeping");

    }

    public static void main(String [] arg) {
        LargeTask task=new LargeTask();
        Thread t1=new Thread(task);

        //delay for 3 sec
        t1.start();
        try{
            t1.join();
        }
        catch (InterruptedException e){
            System.out.println("Thread was intrupted");
        }

        System.out.println("Hello");

    }
}
