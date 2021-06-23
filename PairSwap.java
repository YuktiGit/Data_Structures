import java.io.*; 
import java.util.*; 

class Pair { 
	int x; 
	int y; 

   public Pair(int x, int y)	{ 
		this.x = x; 
		this.y = y; 
   } 
} 

class Compare { 
	static void compare(Pair arr[], int n) { 
		Arrays.sort(arr, new Comparator<Pair>() { 
		 public int compare(Pair p1, Pair p2)	{ 
				return p1.y - p2.y; 
			} 
		}

		for (int i = 0; i < n; i++) { 
			System.out.print(arr[i].x + " " + arr[i].y + " "); 
		} 
		System.out.println(); 
	} 
} 
 
class PairSwap { 
 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int n = 5; 
		Pair arr[] = new Pair[n]; 
		arr[0] = new Pair(10, 20); 
		arr[1] = new Pair(1, 2); 
		arr[2] = new Pair(3, 1); 
		arr[3] = new Pair(10, 8); 
		arr[4] = new Pair(4, 3); 

		Compare obj = new Compare(); 

		obj.compare(arr, n); 
	} 
} 
