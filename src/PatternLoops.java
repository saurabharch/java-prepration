public class PatternLoops {

    public static void main(String[] args) {

        /*

         * * * *
         * * * *
         * * * *
         * * * *

        * */
        System.out.println("Printing Square * Matrix");
        for(int i=0;i<4;i++)
        {
            for (int j = 0;j<4;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        /*
         i1 i2 i3 i4
     j1   * * * *
     j2   *     *
     j3   *     *
     j4   * * * *

         */

        System.out.println("Printing void square");

        for (int i=0;i<=4;i++){

            for (int j = 0 ; j<=4;j++){
                if(i == 1 || i == 4 || j == 1 || j == 4){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }

        /*

         *
         * *
         * * *
         * * * *

         */
        System.out.println("Printing Triangle *");
        for(int i=0;i<4;i++)
        {
            for (int j = 0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        /*

        1 2 3 4
        2 3 4 1
        3 4 1 2
        4 1 2 3

         */

        for (int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                int k=i+j-1;
                if(k>4)
                System.out.print(k-4+" ");
                else
                    System.out.print(k+" ");
            }
            System.out.println("");
        }

        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

         */

        System.out.println("Printing a triangle with 0 and 1");
        for (int i=1;i<=5;i++){ // rows
            for(int j=1;j<=i;j++){ // columns
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println("");

        }

        /*



         */

        System.out.println("Printing Triangle which values is row is equal to column");

        for (int i=1;i<=5;i++){ // rows
            for(int j=1;j<=i;j++){ // columns
                System.out.print(i+" "); // printing row number
            }
            System.out.println("");

        }
    }
}
