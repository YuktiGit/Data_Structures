//Queues with n no.of items
class Queue {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;

   public Queue(int s) {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
   }
   
   public void insert(long j) {
      if(rear == maxSize-1) // deal with wraparound
            rear = -1;
            queArray[++rear] = j; // increment rear and insert
            nItems++; // one more item
   }

   public long remove() {
      long temp = queArray[front++]; // get value and incr front
      if(front == maxSize) // deal with wraparound
            front = 0;
            nItems--; // one less item
      return temp;
   }

   public long peekFront() {
      return queArray[front];
   }
   
   public boolean isEmpty() {
      return (nItems==0);
   }
   
   public boolean isFull() {
      return (nItems==maxSize);
   }
   
   public int size() {
      return nItems;
   }
}


//queues without n no.of items
   public boolean isEmpty() {
      return ( rear+1==front || (front+maxSize-1==rear) );
   }

   public boolean isFull() {
      return ( rear+2==front || (front+maxSize-2==rear) );
   }

   public int size() {
      if(rear >= front) // contiguous sequenc
         return rear-front+1;
      else // broken sequence or wapping queues(ring queues)
         return (maxSize-front) + (rear+1);
    }
}