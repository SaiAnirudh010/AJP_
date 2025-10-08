import java.util.HashMap;
import java.util.TreeMap;
public class MapOperations{
public static void main(String args[]){
HashMap<String,Integer> hm = new HashMap<>();
hm.put("Apple",10);
hm.put("Banana",20);
hm.put("Cherry",30);
System.out.println("Hashmao: "+hm);
hm.put("Date",40);
System.out.println("after insertion: "+hm);
hm.remove("Banana");
System.out.println("After deletion : "+hm);
for(String key:hm.keySet()){
System.out.println(key+":"+hm.get(key));
}
boolean containsKey=hm.containsKey("Apple");
System.out.println("containskey 'Apple' : "+containskey);
}

}