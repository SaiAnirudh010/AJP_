import java.util.LinkedList;
public class SimpleLinkedList{
public static void main(String args[]){
LinkedList<String> list=new LinkedList<>();
list.add("apple");
list.add("Banana");
list.add("Mango");
list.add("Orange");
System.out.println("linked list : "+list);
System.out.println("First element: "+list.getFirst());
System.out.println("Last element: "+list.getLast());
list.set(5,"Grapes");
System.out.println("After update : "+list);
list.remove("Mango");
System.out.println("After removal: "+list);
System.out.println("iterating linked list: ");
for(String item:list){
System.out.println(item);
}
} 
}
