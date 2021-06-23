import java.util.*; 

class AlternateSort { 
	public static void alternateSort(LinkedList<Integer> ll) { 
		Collections.sort(ll); 
		
		for (int i = 1; i < (ll.size() + 1)/2; i++) { 
			Integer x = ll.getLast(); 
			ll.removeLast(); 
			ll.add(2*i - 1, x); 
		} 
		
		System.out.println(ll); 
	} 
	
	public static void main(String[] args) { 
		Integer arr[] = {1, 3, 8, 2, 7, 5, 6, 4}; 
		LinkedList<Integer> llist = new LinkedList<Integer>(Arrays.asList(arr)); 
		alternateSort(llist); 
	} 
} 
