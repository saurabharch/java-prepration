public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;

        if(a==1){
            System.out.println("Value is same "+a);
        } else {
            System.out.println("Value is not Same");
        }
        int k = a==1?a:b; // Above if and else is converted into ternary operator
        System.out.println("By using Ternary Operator Output: "+k);

        Object obj1;
        Object obj2;
//        if(true){
//            obj1 = new Integer(10);
//        }else {
//            obj1 = new Double(20.0);
//        }
//        System.out.println(obj1);
//
//        // Coverting the above code in to ternary operators
//        obj2 = true? new Integer(10):new Double(20.0); // checking the datatype in both of the conversion than output is Maximum
//
//        System.out.println(obj2);
    }
}
