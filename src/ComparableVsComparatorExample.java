import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableVsComparatorExample {

    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop(8,70000,"Dell"));
        laps.add(new Laptop(16,170002,"Apple"));
        laps.add(new Laptop(4,40000,"IBM"));
        laps.add(new Laptop(24,125000,"Lenovo"));
        laps.add(new Laptop(2,45000,"Acer"));
        laps.add(new Laptop(12,190000,"HP"));

        // Using Comparator Interface Result In Pricing Oder
//        Collections.sort(laps,(l1,l2)-> {
//            return l1.price>l2.price?1:-1;
//        });
        Collections.sort(laps); // Result in RAM capacity order
        for (Laptop l : laps){
            System.out.println(l);
        }

    }
}
