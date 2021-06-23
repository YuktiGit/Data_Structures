import java.util.*;
public class link_compare{
   static Node head1;
   static Node head2;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int sizea =0;
      int sizeb =0;
      System.out.print("Enter no. of elements of list1:");
      sizea = sc.nextInt();
      for(int i =0; i<sizea; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         back(a,1);
      }
      System.out.print("Enter no. of elements of list2:");
      sizeb = sc.nextInt();
      for(int i =0; i<sizeb; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         back(a,2);
      }
      findIdentical(sizea,sizeb);
   }
   public static void back(int a,int b){
      Node n = new Node();
      n.data = a;
      Node temp = new Node();
      if(b==1){
         temp = head1;
         if(head1 == null){
            head1 = n;
         }
         else{
            while(temp.next!=null){
               temp = temp.next;
            }
            temp.next = n;
         }
      }
      else if(b==2){
         temp = head2;
         if(head2 == null){
            head2 = n;
         }
         else{
            while(temp.next!=null){
               temp = temp.next;
            }
            temp.next = n;
         }
      }
   }
   public static void findIdentical(int sizea,int sizeb){
      if(sizea != sizeb){
         System.out.println("FALSE");
      }
      else{
         Node temp1 = head1;
         Node temp2 = head2;
         int ctr = 0;
         while(temp1!= null && temp2!= null){
            if(temp1.data == temp2.data) ctr++;
            temp1 = temp1.next;
            temp2 = temp2.next;
         }
         if(ctr == sizea) System.out.println("The two lists are IDENTICAL");
         else System.out.println("The two lists are NON-IDENTICAL");
      }
   }
}