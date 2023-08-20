public class MultithreadingExample {

    public static void main(String[] args) {
        Ta a = new Ta();
        Tb b = new Tb();
        a.start();
        try {Thread.sleep(10);}catch (Exception e){};
        b.run();
    }
}

class Ta extends Thread {
    public void run(){
        for (int i =0; i<=5;i++){
            System.out.println(i+". Hi");
            try {Thread.sleep(500);}catch (Exception e){};
        }
    }
}

class Tb extends Thread {
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println(i+". Hello");
            try {Thread.sleep(500);}catch (Exception e){};
        }
    }
}