public class LabeledBreakStatement {
    public static void main(String[] args) {

        // break switch loop
        // Inner loop Break Example
        System.out.println("Inner Break Example");
        for (int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==3)
                    break; // unlabeled break statement
                System.out.print("* ");
            }
            System.out.println("");
        }

        //Outer loop Break Example
        System.out.println("Outer Loop Break Example");
        saurabh:
        for (int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==3)
                    break saurabh; // labeled break statement
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
