import java.util.*;
/*  This program demonstrate the usage of LinkedList class*/
class linkedmaxmin{
   public static void main(String[] args){
      LinkedList<Integer> list = new LinkedList<>();
      LinkedList<Integer> list1 = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of list:  ");
      int size = sc.nextInt();
      System.out.println("Enter elements");
      int a =0;
      for(int i =0; i<size;i++){
         System.out.print((i+1)+"  =   ");
         a= sc.nextInt();
         list.add(a);
      }
      int[] array = new int[list.size()];
      for(int i =0; i<list.size();i++){
         array[i]=list.get(i);
      }
      Arrays.sort(array);
      for(int i =0;i<size/2;i++){
         list1.add(array[i]);
         list1.add(array[size-i-1]);
      }
      if(size%2!=0){
         list1.add(array[size/2+1]);
      }
      System.out.println(list1);
   }
}