import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceInJavaCollectionFrameworkExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Name","Saurabh");
        map.put("CEO","Ankit");
        map.put("Company","Sterlite");
        map.put("Guest","G. Babu");

        Set<String> keys= map.keySet();
        for(String key: keys){
            System.out.println(key+ ": "+map.get(key));
        }

    }
}
