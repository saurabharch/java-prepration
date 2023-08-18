public class RepresentTwoDimentionalArray {
    public static void main(String[] args) {
        int a=3,b=4,c=6,d=7;
        int x[] = {4,6,8,9};
        int y[] = {8,9,3,2};
        int z[] = {2,3,4,5};
        int p[][] = {
                {4,6,8,9},
                {8,9,3,2},
                {2,3,4,5}
        };

        int k[][] = {
                {4,6,},
                {8,9,3,2},
                {2,3,4,}
        };

        System.out.println("First Method for Two Dimentional Array");
        for (int i =0; i<3;i++){ // number of arrays is 3 so the i < 3
            for (int j = 0;j<4;j++){ // number of object in array is 4 so the j < 4
                System.out.printf(p[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Second Enhanced Method for presenting two dimentional array");
        for(int i[] : p){
            for(int j : i){
                System.out.print(j+ " ");
            }
            System.out.println("");

        }
        System.out.println("Jagged Array Example");
        for(int i[] : k){
            for(int j : i){
                System.out.print(j+ " ");
            }
            System.out.println("");

        }

    }
}
