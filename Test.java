class Test  { 
  
    private int josephus(int n, int k) { 
        int sum = 0; 
        for(int i = 2; i <= n; i++) { 
            sum = (sum + k) % i; 
        } 
  
        return sum+1; 
    } 
  
    public static void main(String[] args) {  
        int n = 4;  
        int k = 5;  
        Test obj = new Test(); 
        System.out.println(obj.josephus(n, k));  
    } 
} 