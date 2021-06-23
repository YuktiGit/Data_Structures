import java.util.*;
class StackArray{
   static int top1 = -1;
   static int top2 = -1;
   static int top3 = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int size = 0;
      System.out.print("Enter no.of elements for first stack:  ");
      size = sc.nextInt();
      int[] array1 = new int[size];
      System.out.println("Push elements in stack");
      for(int i =0; i<size ;  i++){
         System.out.print("Enter "+(i+1)+" element:  ");
         int a = sc.nextInt();
         push(a,array1,1);
      }
      System.out.print("Enter no.of elements for second stack:  ");
      size = sc.nextInt();
      int[] array2 = new int[size];
      System.out.println("Push elements in stack");
      for(int i =0; i<size ;  i++){
         System.out.print("Enter "+(i+1)+" element:  ");
         int a = sc.nextInt();
         push(a,array2,2);
      }
      System.out.print("Enter no.of elements for third stack:  ");
      size = sc.nextInt();
      int[] array3 = new int[size];
      System.out.println("Push elements in stack");
      for(int i =0; i<size ;  i++){
         System.out.print("Enter "+(i+1)+" element:  ");
         int a = sc.nextInt();
         push(a,array3,3);
      }
      int sum1 = sum(array1,1);
      int sum2 = sum(array2,2);
      int sum3 = sum(array3,3);
      while(sum1!= sum2 || sum2!=sum3 || sum1!= sum3){
         if(sum1>=sum2 && sum1>= sum3){
            pop(array1,1);
            sum1 = sum(array1,1);
         }
         else if(sum2>=sum1 && sum2>= sum3){
            pop(array2,2);
            sum2 = sum(array2,2);
         }
         else if(sum3>=sum2 && sum3>= sum1){
            pop(array3,3);
            sum3 = sum(array3,3);
         }
      }
      System.out.println("Maximum equal sum =  "+sum1);
   }
   public static void push(int a,int array[],int n){
      if(n==1){
         top1++;
         array[top1] = a;
      }
      if(n==2){
         top2++;
         array[top2] = a;
      }
      if(n==3){
         top3++;
         array[top3] = a;
      }
   }
   public static void pop(int array[],int n){
      if(n==1){
         top1--;
      }
      if(n==2){
         top2--;
      }
      if(n==3){
         top3--;
      }
   }
   public static int sum(int array[],int n){
      int sum = 0;
      if(n==1){
         for(int i =top1; i>-1; i--){
            sum = sum + array[i];
         }
      }
      else if(n==2){
         for(int i =top2; i>-1; i--){
            sum = sum + array[i];
         }
      }
      else if(n==3){
         for(int i =top3; i>-1; i--){
            sum = sum + array[i];
         }
      }
      return sum;
   }
}