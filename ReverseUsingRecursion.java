//Reverse stack using recursion 
import java.util.*;

class ReverseUsingRecursion {

   static Stack<Character> s = new Stack<>();
   
   static void insertAtBottom(char c){
      if(s.isEmpty())
         s.push(c);
      else{
         char a = s.peek();
         s.pop();
         insertAtBottom(c);
         s.push(a);
      }
   }
   
   static void reverse(){
      if(s.size() > 0){
         char x = s.peek();
         s.pop();
         reverse();
         
         insertAtBottom(x);
      }
   }
   
   public static void main(String [] args){
      
        s.push('1'); 
        s.push('2'); 
        s.push('3'); 
        s.push('4'); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(s); 
         
        reverse(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(s); 
   }
}