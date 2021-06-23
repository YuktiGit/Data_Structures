import java .io.*; 
  
class DecimalToBinary { 
 
    static boolean LSB(int num, int K) { 
        boolean x = (num & (1 << (K-1))) != 0; 
        return (x); 
    } 
      
     public static void main(String[] args) { 
        int num = 10, K = 4; 
          
        if(LSB(num, K))  
            System.out.println("1") ; 
          
        else
            System.out.println("0"); 
    }  
} 
  