import java.io.*; 
import java.util.*;

class SelectionSort { 
	void sort(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) { 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
    }  
      
    void bubbleSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
    
    void insert(int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 

	void printArray(int arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	public static void main(String args[]) { 
      Random rand = new Random();
		SelectionSort ob = new SelectionSort(); 
		int arr[] = new int[10000000];
      for(int i=0; i<arr.length; i++){
        arr[i] = rand.nextInt();
      }
      
      long start = System.currentTimeMillis();
   	ob.sort(arr); 
    //ob.bubble(arr);
    //ob.insert(arr);
      long end = System.currentTimeMillis();
       
      System.out.println("Counting to 100000 takes " + (end - start) + "ms"); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 