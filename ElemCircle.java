import java.io.*; 
  
class ElemCircle { 
  public static int remaining(int n, int k) {
    int r = 0;
    for (int i = 1; i <= k; i++)
        r = (r + k) % i;

    return r+1;
}
  
   public static void main(String[] args) { 
         int n = 8; 
         int k = 2; 
         System.out.println("The chosen place is " );
         int a = remaining(n, k);
         System.out.println(a);
   } 
} 
 