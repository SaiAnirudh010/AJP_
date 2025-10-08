import java.util.Stack;
public class StackOperations{
public static void main(String args[]){
Stack<Integer> sta= new Stack<>();
sta.push(10);
sta.push(20);
sta.push(30);
System.out.println("stack: "+sta);
int poped=  sta.pop();
System.out.println("Stack after popped :"+sta);
int top=sta.peek();
System.out.println("tOP ELEMENT :"+top);
boolean isEmpty=sta.empty();
System.out.println("Is stack empty?: "+isEmpty);
int index=sta.search(10);
System.out.println("Index of 10 :"+index);
}}