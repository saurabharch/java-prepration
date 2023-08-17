public class LoopsExample {

    public static void main(String[] args) {
        int i = 1; // Initialization
        int j =1;
        int k = 1;
        System.out.println("Running while loop");
        while(i<10) // (Condition) checking wheather i is always less than up to 10 so the statement is true when i=10 it is false
        {
            System.out.println(i);
            i++; // i = i+ 1; --> PostIncrement , ++i PreIncrement
        }
        System.out.println("Running Do While loop");

        // Here First Check the condition before executing the loop
        do {
            System.out.println(j);
            j++; // i = i + 1; --> PostIncrement, ++i PreIncrement
        }while (j<10); // Checking the condition

        System.out.println("Running For Loop");

        for (k=1;k<10;k++){
            System.out.println(k);
        }

    }
}
