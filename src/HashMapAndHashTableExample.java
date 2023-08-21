import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapAndHashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Employee","Saurabh");
        map.put("CEO","Ankit");
        map.put("Company","Sterlite");
        map.put("Guest","G. Babu");

//        Set<String> keys= map.keySet();
        Set<Map.Entry<String, String>> values = map.entrySet(); // Map.Entry -> interface inside the Map
        for(Map.Entry<String,String> e: values){
            System.out.println(e.getKey()+ ": "+e.getValue());
        }
    }
}
