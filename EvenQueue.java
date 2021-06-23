class Queue { 
	private static int front, rear, capacity; 
	private static int queue[]; 

	Queue(int c) { 
		front = rear = 0; 
		capacity = c; 
		queue = new int[capacity]; 
	} 

	static void queueEnqueue(int data) { 
		if (capacity == rear) { 
			System.out.printf("\nQueue is full\n"); 
			return; 
		} 

		else { 
			queue[rear] = data; 
			rear++; 
		} 
		return; 
	} 


	static void queueDisplay() { 
		int i;
      int count = 0; 
		if (front == rear) { 
			System.out.printf("\nQueue is Empty\n"); 
			return; 
		} 
		for (i = front; i < rear; i++) { 
        if(queue[i] % 2 == 0){
         count = count + 1;
        } 
		  System.out.printf(" %d ", queue[i]); 
		} 
      System.out.println();
      System.out.print("No.of even numbers in the queue :" + count);
		return; 
	} 

} 

public class EvenQueue { 

	public static void main(String[] args)	{ 
		Queue q = new Queue(4); 
		q.queueDisplay(); 
		q.queueEnqueue(2); 
		q.queueEnqueue(3); 
		q.queueEnqueue(4); 
		q.queueEnqueue(5); 
       
		q.queueDisplay(); 

	} 
} 
