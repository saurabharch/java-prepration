public class MultithreadingUsingRunnableInterface {

    public static void main(String[] args) {
        Runnable a = new Tas();
        Runnable b = new Tbs();

        Thread t = new Thread(a);
        Thread t1 = new Thread(b);
        t.start();
        try {Thread.sleep(10);}catch (Exception e){};
        t1.start();
    }
}

class Tas implements Runnable {
    public void run(){
        for (int i =0; i<=5;i++){
            System.out.println(i+". Hi");
            try {Thread.sleep(500);}catch (Exception e){};
        }
    }
}

class Tbs implements Runnable {
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println(i+". Hello");
            try {Thread.sleep(500);}catch (Exception e){};
        }
    }
}