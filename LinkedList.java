class LinkedList { 
    Node head;  
    class Node { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
    public void push(int new_data) { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    
    public Node tail = null;
    
    public void insertAfter(Node prev_node, int new_data) { 
        if (prev_node == null) 
        { 
            System.out.println("The given previous node cannot be null"); 
            return; 
        } 

        Node new_node = new Node(new_data); 
        new_node.next = prev_node.next; 
        prev_node.next = new_node; 
    } 
     
    public void append(int new_data)  { 
        Node new_node = new Node(new_data); 
        if (head == null) 
        { 
            head = new Node(new_data); 
            return; 
        } 
        
        new_node.next = null; 
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        return; 
    } 

    public void printList() { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    
    void deleteNodePos(int position)  { 
        if (head == null) 
            return; 
        Node temp = head; 

        if (position == 0) { 
            head = temp.next;   
            return; 
        } 

        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
        if (temp == null || temp.next == null) 
            return; 

        Node next = temp.next.next; 
        temp.next = next;  
    } 
    
   public void deleteFromEnd() {  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail ) {  
                Node current = head;    
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;  
                tail.next = null;  
            }  
            else {  
                head = tail = null;  
            }  
        } 
    }
    
    void deleteNode(int key)  { 
        Node temp = head, prev = null; 
        if (temp != null && temp.data == key)   { 
            head = temp.next;
            return; 
        } 
        while (temp != null && temp.data != key) { 
            prev = temp; 
            temp = temp.next; 
        }     
        if (temp == null)
           return; 
     
        prev.next = temp.next; 
    } 
    
    public void deleteFromStart() {  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {   
            if(head != tail) {  
                head = head.next;  
            }  

            else {  
                head = tail = null;  
            }  
        }  
    }      

    public static void main(String[] args)  { 

        LinkedList llist = new LinkedList(); 

        llist.append(6); 
        llist.push(7); 
        llist.push(1); 
        llist.append(4); 
        llist.insertAfter(llist.head.next, 8); 
        llist.deleteFromStart();
        llist.deleteFromEnd();
        llist.deleteNode(7);
        llist.deleteNodePos(3);
        
  
        System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
    } 
    
} 
