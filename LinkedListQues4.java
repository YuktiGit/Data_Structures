import java.util.*;
class LinkedListQues4 { 
	Node head;  
	Node left; 
	class Node { 
		char data; 
		Node next; 

		Node(char d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	boolean isPalindromeUtil(Node right) 
	{ 
		left = head; 
		if (right == null) 
			return true; 
		boolean isp = isPalindromeUtil(right.next); 
		if (isp == false) 
			return false; 
		boolean isp1 = (right.data == (left).data); 
		left = left.next; 

		return isp1; 
	} 

	boolean isPalindrome(Node head) 
	{ 
		boolean result = isPalindromeUtil(head); 
		return result; 
	} 
	public void push(char new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 

	void printList(Node ptr) 
	{ 
		while (ptr != null) { 
			System.out.print(ptr.data + "->"); 
			ptr = ptr.next; 
		} 
		System.out.println("NULL"); 
	} 

	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the size of linked list:");
      int s = sc.nextInt();
       char b[] = new char[s];
		for(int i = 0; i<s ; i++){
         System.out.print("\nEnetr element "+(i+1)+" : ");
         b[i] = sc.nextChar();
      }
      

		String string = new String(b);
		for (int i = 0; i < s; i++) { 
			llist.push(b[i]); 
			llist.printList(llist.head); 
			if (llist.isPalindrome(llist.head) != false) { 
				System.out.println("Is Palindrome"); 
				System.out.println(""); 
			} 
			else { 
				System.out.println("Not Palindrome"); 
				System.out.println(""); 
			} 
		} 
	} 
} 

