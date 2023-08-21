import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayListExample {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> v1 = new ArrayList<Integer>(9); // Increase the capacity by 50% // not threadSafe // fast
        v1.add(1);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        System.out.println("ArrayList Result:");
//        System.out.println("ArrayList Size: "+v1.size());
//        System.out.println("ArrayList Capacity: "+getCapacity(v1));
        for(int i :v1){
            System.out.println(i);
        }

        Vector<Integer> v = new Vector<Integer>();  // Increase the capacity by 100% // ThreadSafe // slow
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        System.out.println("Vector List Result:");
        v.remove(7); // remove 7 integer where 7 is first appear in index
        System.out.println("Vector capacity: "+v.capacity());
        for(int i:v){
            System.out.println(i);
        }

    }

    // ERROR OUTPUT -- fix:todo
    // Creating a costume method for get the ArrayList Capacity by using java.lang.reflect.Field;
//    private static int getArrayListCapacity(ArrayList<?> list) throws Exception{
//
//        //get the elementData field from ArrayList class
//        Field arrayField = ArrayList.class.getDeclaredField("elementData");
//
//        /*
//         * Since the elementData field is private, we need
//         * to make it accessible first
//         */
//        arrayField.setAccessible(true);
//
//        //now get the elementData Object array from our list
//        Object[] internalArray = (Object[])arrayField.get(list);
//
//        //Internal array length is the ArrayList capacity!
//        return internalArray.length;
//    }
}
