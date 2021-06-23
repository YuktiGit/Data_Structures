import java.util.*;
public class link_Palin{
   class Node { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
   }

   static Node head;    
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the size of linked list:");
      int s = sc.nextInt();
      int a[] = new int[s];
      String b[] = new String[s];
      for(int i = 0; i<s ; i++){
         System.out.print("\nEnetr element "+(i+1)+" : ");
         a[i] = sc.nextInt();
         node_end(a[i]);
      }
      
      for(int i = 0; i<s; i++){
         b[i] = Integer.toString(a[i]);
      }
      System.out.print("\nThe entered Nodes are :");
      print_nodes();
      
      int p = check_pal(a);
      if(p==1){
         System.out.print("\nThe list is palindrome");
      }
      else
         System.out.print("\nThe list is not palindrome");

      
   }
   
    
    public void push(int new_data) { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
   }
   public static void print_nodes(){
      Node temp = new Node();
      temp = head;
      if(temp == null){
         System.out.print("\nNo Elements found!\n");
      }
      else{
         while(temp.next!=null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
         }
         System.out.print(temp.data+"\n");
      }
   }
   
   
   public static void node_end(int data_){
      Node new_node = new Node();
      new_node.data = data_;
      Node temp = new Node();
      temp = head;
      if(head==null){
         head = new_node;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = new_node; 
      }    
   }
   
  
   public static int check_pal(int[] b){ 
      int ctr = 0;
      int l = b.length;
      for (int j=0; j<l/2; j++) {
         if (b[j]==(b[l-j-1])){
            ctr = ctr+1;
         }
         else
            continue;   
      }
      if(ctr==l/2){
         return 1;
      } 
      else{
         return 0;
      }        
   }

}