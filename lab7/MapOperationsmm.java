import java.util.HashMap;
import java.util.Map;

public class MapOperationsmm {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Apple", 10);
        hm.put("Banana", 20);
        hm.put("Cherry", 30);
        System.out.println("HashMap: " + hm); // Corrected typo from "Hashmao"

        hm.put("Date", 40);
        System.out.println("after insertion: " + hm);

        hm.remove("Banana");
        System.out.println("After deletion: " + hm);

        // Correctly iterate over the key set using .keySet()
        for (String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }

        boolean containsKey = hm.containsKey("Apple");
        // Corrected method name from .containsget to .containsKey
        System.out.println("containskey 'Apple': " + containsKey);
    }
}
