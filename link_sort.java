import java.util.*;
public class link_sort{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of linked list : ");
      int size = sc.nextInt();
      int a[] = new int[size];
      LinkedList<Integer> l = new LinkedList<Integer>();
      System.out.print("\nEnter the elements in the list");
      for(int i =0 ; i<size ; i++){
         System.out.print("\nEnter element "+(i+1)+ " ");
         a[i] = sc.nextInt();
         l.add(a[i]);
      }
      System.out.print("\nThe entered elemts in the list are :"+l);
      Arrays.sort(a);
      int new_array[] = new int[size];
      new_array[0] = a[0];
      new_array[1] = a[size-1];
      l.set(0,a[0]);
      l.set(1,a[size-1]);
      int j = 0;
      for(j = 0 ; j<(size-2)/2 ; j++){
         l.set(j+2,a[j+1]); 
      } 
      l.set(j+2,a[j+2]);
      l.set(size-1,a[j+1]);
      System.out.print("\nThe sorted elements are :"+l);
   }
}