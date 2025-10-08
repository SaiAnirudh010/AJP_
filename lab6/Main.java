import java.util.ArrayList;
public class Main{
public static void main(String args[]){
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Orange");
System.out.println("Initial Arraylist: "+fruits);
System.out.println("Elements at index 2 : "+fruits.get(2));
fruits.set(1,"Grapes");

System.out.println("After updating index 1 :"+fruits);
fruits.remove("Orange");

System.out.println("After removing Orange :"+fruits);

System.out.println("\n Iterating through elements: ");
for(String fruit : fruits){

System.out.println(fruit);
}
if(fruits.contains("Mango")){
System.out.println("\n Mango is present in the list");

}

System.out.println("Size of ArrayList: "+fruits.size());
fruits.clear();

System.out.println("ArrayList after clear() :"+fruits);
}}