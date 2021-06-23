import java.util.*;

class MorseCode { 
   public static String morseDecode(char x) {
        switch (x) { 
            case 'a': 
                return ".-|"; 
            case 'b': 
                return "-...|"; 
            case 'c': 
                return "-.-.|"; 
            case 'd': 
                return "-..|"; 
            case 'e': 
                return ".|"; 
            case 'f': 
                return "..-.|"; 
            case 'g': 
                return "--.|"; 
            case 'h': 
                return "....|"; 
            case 'i': 
                return "..|"; 
            case 'j': 
                return ".---|"; 
            case 'k': 
                return "-.-|"; 
            case 'l': 
                return ".-..|"; 
            case 'm': 
                return "--|"; 
            case 'n': 
                return "-.|"; 
            case 'o': 
                return "---|"; 
            case 'p': 
                return ".--.|"; 
            case 'q': 
                return "--.-|"; 
            case 'r': 
                return ".-.|"; 
            case 's': 
                return "...|"; 
            case 't': 
                return "-|"; 
            case 'u': 
                return "..-|"; 
            case 'v': 
                return "...-|"; 
            case 'w': 
                return ".--|"; 
            case 'x': 
                return "-..-|"; 
            case 'y': 
                return "-.--|"; 
            case 'z': 
                return "--..|"; 
            case ' ':
                return "   ";
        } 
        return "#"; 
    } 
    
    public static void getChar(String s) {
         for(int j = 0; j < s.length(); j++) {
               System.out.print(morseDecode(s.charAt(j)));
         }
    }
    public static void main(String[] args) {
         System.out.print("Enter your name : ");
         Scanner in = new Scanner(System.in);
         String s = in.nextLine();
         System.out.println();
         getChar(s);
    }    
    
}