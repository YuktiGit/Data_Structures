class StackPrac{
   private int maxSize;
   private long[] stackArray;
   private int top;
   
   public StackPrac(int s){
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   
   public void push(long j){
      stackArray[++top] = j;
   }
   
   public long pop(){
      return stackArray[top--];  
   }
   
   public long peep(){
      return stackArrray[top];
   }
   
   public boolean isEmpty(){
      return (top == -1);
   }
   
   public boolean isFull(){
      return (top == maxSize-1);
   }
}

