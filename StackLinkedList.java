import java.util.*;
class Top{
   int data;
   Top next ;
   Top pre ;
   Top(){
      data = 0;
      next = null;
   }
}
public class StackLinkedList{
   static Top top;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      do{
         System.out.println(" Enter 1  to add element in stack.\n Enter 2 to pop elements.\n Enter 3 to print top element.\n Enter 4 to print stack.\n Enter 5 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Push element in stack:  ");
            int a = sc.nextInt();
            push(a);
         }
         else if(choice==5) System.out.println("Program terminated.");
         else if(choice==4){
            print();
         }
         else if(choice==2){
            pop();
         }
         else if(choice==3){
            peek();
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=5);
   }
   public static void push(int a){
      Top n = new Top();
      n.data = a;
      n.next=top;
      top = n;
   }
   public static void print(){
      Top temp = new Top();
      temp = top;
      if(top == null) System.out.println("Stack underflow");
      else{
         while(temp.next!=null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
         }
         System.out.print(temp.data);
         System.out.println();
      }
   }
   public static void pop(){
      Top temp = new Top();
      temp = top;
      if(top==null) System.out.println("Stack underflow");
      else{
         System.out.println("element :  "+top.data);
         top = top.next;
         temp.next = null;
      }
   }
   public static void peek(){
      System.out.println("Top element : "+top.data);
   }
}

