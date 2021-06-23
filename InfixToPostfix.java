import java.util.*;
   
class InfixToPostfix {
   
   static int isOperatorOrDigit(char input) { 
		switch (input) { 
		   case '+': 
		   	return 1; 
		   case '-': 
		   	return 1; 
		   case '*': 
		   	return 1; 
		   case '%': 
		   	return 1; 
		   case '/': 
		   	return 1; 
		   case '(': 
		   	return 1;
         default : 
            return 0; 
		}  
	} 
   
   static int inPrec(char input) { 
		switch (input) { 
		case '+': 
		case '-': 
			return 2; 
		case '*': 
		case '%': 
		case '/': 
			return 4; 
		case '(': 
			return 0; 
		} 
		return 0; 
	} 

	static int outPrec(char input) { 
		switch (input) { 
		case '+': 
		case '-': 
			return 1; 
		case '*': 
		case '%': 
		case '/': 
			return 3; 
		case '(': 
			return 100; 
		} 
		return 0; 
	} 


   public static String infixToPostfix(char[] input){
      for(int i = 0; i < input.length; i++){
         if(isOperatorOrDigit(input[i]) == 1){
            System.out.print(input[i]);
         }
         else if(isOperatorOrDigit(input[i]) == 1){
            if(!s.empty() || outPec(input[i]) > inPec(s.peek()))
               s.push(input[i]);      
            else {
               if(!s.empty() && outPrec(input[i]) < inPrec(s.peek())) {
                  System.out.print(s.peek);
                  s.pop(s.peek); 
               }
               s.push(input[i]);   
            }                 
         }
         else if (input[i] == ')') { 
				while(s.peek() != '(') { 
					System.out.print(s.peek()); 
					s.pop(); 
					if (s.empty()) { 
						System.out.println("Wrong input"); 
					} 
				}
            s.pop();
      }
   }
   while (!s.empty()) { 
			if (s.peek() == '(') { 
				System.out.println("Wrong input");  
			} 
			System.out.println(s.peek()); 
			s.pop(); 
		} 
	}
   
   public static void main(String [] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the infix expression : ");
      String str= s.nextLine();
      char arrChar[] = str.toCharArray();
      infixToPostfix(arrChar);
   } 
}