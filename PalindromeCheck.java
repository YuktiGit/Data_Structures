import java.util.*;
public class PalindromeCheck { 

	static boolean isPalindrome(String str) { 
		int i = 0;
      int j = str.length() - 1; 
		while (i < j) { 
			if (str.charAt(i) != str.charAt(j)) 
				return false; 
			i++; 
			j--; 
		} 
		return true; 
	} 
	public static void main(String[] args) {
      System.out.print("Enter the string : ");
      Scanner in = new Scanner(System.in); 
		String str = in.nextLine(); 
		if (isPalindrome(str)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	} 
} 









