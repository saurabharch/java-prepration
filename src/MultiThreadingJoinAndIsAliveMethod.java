public class MultiThreadingJoinAndIsAliveMethod {

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            // creating anonymous class with lambda expression because Runnable support lambda expression
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + ". Hi");
                try {Thread.sleep(500);} catch (Exception e){};
            }
        });
        Thread t1 = new Thread(() -> {  // creating anonymous class with lambda expression because Runnable support lambda expression
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + ". Hello");
                try {Thread.sleep(500);} catch (Exception e) {};
            }
        });
        t.start();
        try {Thread.sleep(10);} catch (Exception e) {};
        t1.start();
        t.join();
        t1.join();
        if (t1.isAlive() == false && t.isAlive() == false) {
            System.out.println("Bye");
        }
    }
}
