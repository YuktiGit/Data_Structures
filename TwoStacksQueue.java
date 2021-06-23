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
public class TwoStacksQueue{
  static Top top;
  
  public static void main(String args[]){
      TwoStacksQueue tSQ1 = new TwoStacksQueue();
      TwoStacksQueue tSQ2 = new TwoStacksQueue();
      
      tSQ1.push(1);
      tSQ1.push(2);
      tSQ1.push(3);
      tSQ1.push(4);
      tSQ1.push(5);
      tSQ1.push(6);
      tSQ1.push(7);
      tSQ1.print();
      tSQ1.pop();
      
      tSQ1.print();
  } 
   public static void push(int a){
      Top n = new Top();
      n.data = a;
      n.next=top;
      top = n;
   }
   
   public static void pop(){
      Top temp = new Top();
      temp = top;
      if(top==null) System.out.println("Stack underflow");
      else{
       while(top == null){
         push(top.data);
         top = top.next;
         temp.next = null;
       }
      }
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
}