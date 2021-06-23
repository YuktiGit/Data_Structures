import java.util.*;
public class Ques2 {  
   class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  

    public Node head = null;  

    public void addNode(int data) {   
        Node newNode = new Node(data);  
        if(head == null) {    
            head = newNode;  
        }  
        else {  
            Node current = head;  
            while(current.next != null) {  
                current = current.next;  
            }   
            current.next = newNode;  
        }  
    }  
    
    public void swapLastWithFirst() {  
        Node current = head, temp = null, index = null;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current.next != null) {  
                index = current;  
                current = current.next;  
            }  
              
            if(head == current) {  
                return;  
            }  
            else if(head.next == current) {  
                temp = head;  
                head = current;  
                head.next = temp;  
                temp.next = null;  
            }  
            else {  
                temp = head;  
                head = current;  
                head.next = temp.next;  
                index.next = temp;  
                temp.next = null;  
            }  
        }  
    }  
      
   void pairWiseSwap() { 
        Node temp = head; 
        while (temp != null && temp.next != null) { 
            int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k; 
            temp = temp.next.next; 
        } 
    } 
      
     void remove_duplicates() { 
        Node ptr1 = null, ptr2 = null, dup = null; 
        ptr1 = head; 
        while (ptr1 != null && ptr1.next != null) { 
            ptr2 = ptr1; 
            while (ptr2.next != null) { 
                if (ptr1.data == ptr2.next.data) { 
                    dup = ptr2.next; 
                    ptr2.next = ptr2.next.next; 
                    System.gc(); 
                } 
                else { 
                    ptr2 = ptr2.next; 
                } 
            } 
            ptr1 = ptr1.next; 
        } 
    } 
    
    void deleteAlt() { 
       if (head == null)  
          return; 
  
       Node prev = head; 
       Node now = head.next; 
  
       while (prev != null && now != null)  {            
          prev.next = now.next; 
          now = null; 
          prev = prev.next; 
          if (prev != null)  
              now = prev.next; 
       } 
    } 
    
   
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        Ques2 sList = new Ques2();  
          
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
   
        System.out.println("Originals list: ");  
        sList.display();  

        sList.swapLastWithFirst();  
        System.out.println("List after swapping the first node with last: ");  
        sList.display();  
        
        llist.pairWiseSwap(); 
        System.out.println("Linked List after calling pairWiseSwap() "); 
        llist.printList(); 
        
        list.remove_duplicates(); 
        System.out.println("Linked List after removing duplicates : \n "); 
        list.printList(); 
        
        llist.deleteAlt();   
        System.out.println("Linked List after calling deleteAlt() "); 
        llist.printList(); 
    }  
}  