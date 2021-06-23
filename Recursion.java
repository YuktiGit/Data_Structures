//Triangular number
//1.Using loops
int triangle(int n){
   int total = 0;
   while(n>0){
      total = total + n;
      --n;
   }
   return total;
}

//2.Using Recursion
int triangle(int n){
   if(n == 1)
      return 1;
   else
      return(n + triangle(n-1));
}

//Factorial
//Using recusion
int factorial(int n){
   if(n == 1)
      return 1;
   else
      return (n * factorial(n-1));
}

//Anagrams
int doAnagram(int n){
   if(n == 1)
      return;
   for(int j; j < n; j++){
      doAnagram(n-1);
      if(n == 2)
         displayWord();
      rotate(n);
   }
}
// rotate left all chars from position to end
public static void rotate(int newSize) {
   int j;
   int position = size - newSize;
   char temp = arrChar[position]; // save first letter
   for(j=position+1; j<size; j++) // shift others left
      arrChar[j-1] = arrChar[j];
      arrChar[j-1] = temp; // put first on right
}

public static void displayWord() {
   if(count < 99)
      System.out.print(“ “);
   if(count < 9)
      System.out.print(“ “);
   System.out.print(++count + “ “);
   for(int j=0; j<size; j++)
      System.out.print( arrChar[j] );
   System.out.print(“ “);
   System.out.flush();
   if(count%6 == 0)
      System.out.println(“”);
}