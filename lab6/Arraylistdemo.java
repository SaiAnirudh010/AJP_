import java.util.*;
public class ArrayListExample{
public static void main(String args[]){
ArrayList<String>list=new ArrayList<String>();
list.add("Mango");
list.add("Apple");
list.add("Banana");
list.add("Grapes");
System.out.println("ArrayList objects....");
System.out.println(list);
list.remove("Mango");
System.out.println("After invoking remove(object) method: "+list);
list.remove(0);
Iterator itr=list.iterator();
System.out.println("Traversing list through iterator...");
while(itr.hasNext()){
System.out.println(itr.next());
}
System.out.println("Traversing list through for-each loop...");
for(String fruit:list){
System.out.println(fruit);
}}
