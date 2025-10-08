import java.util.HashSet;
public class SimpleHastSet{
public static void main(String args[]){
HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Mango");
set.add("Apple");
System.out.println("Hashset: "+set);
System.out.println("contains Mango? :"+set.contains("Mango"));
set.remove("Banana");
System.out.println("After removal :"+set);
System.out.println("iteraring hashset: ");
for(String item: set){
System.out.println(item);
}
System.out.println("Size :"+set.size());


}
}