public class MultithreadingSynchronizedKeywordExample {

    public static void main(String[] args) throws Exception{

        Counter c = new Counter();
        Thread t = new Thread(new Runnable() {
            public void run(){
                    for (int i=1;i<=1000000;i++){
                        c.Increment();
                    }
             }
        });Thread t1 = new Thread(new Runnable() {
            public void run(){
                    for (int i=1;i<=1000000;i++){
                        c.Increment();
                    }
             }
        });
        t.start();
        t.join();
        t1.start();
        t1.join();
        System.out.println(c.count);
        System.out.println("Bye");
    }
}

class Counter{
    int count;
    public synchronized void Increment(){ // synchronised keyword support thread safe, mean only one thread is running at a time
        count++;
    }
}