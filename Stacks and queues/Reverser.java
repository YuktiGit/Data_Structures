import StackPrac;
class Reverser {
   private String input; // input string
   private String output; // output string
   
   public Reverser(String in) // constructor
   { input = in; }
   
   public String doRev() {
      int stackSize = input.length(); 
      StackX theStack = new StackX(stackSize);
      for(int j=0; j<input.length(); j++) {
         char ch = input.charAt(j); 
         theStack.push(ch); // push it
      }
      output = “”;
      while( !theStack.isEmpty() ){
         char ch = theStack.pop(); // pop a char,
         output = output + ch; // append to output
      }
      return output;
}
class ReverseApp {
   public static void main(String[] args) throws IOException {

      String input, output;
      while(true) {
         System.out.print(“Enter a string: “);
         System.out.flush();
         input = getString(); // read a string from kbd
         if( input.equals(“”) ) // quit if [Enter]
               break;
         // make a Reverser
         Reverser theReverser = new Reverser(input);
         output = theReverser.doRev(); // use it   
         System.out.println(“Reversed: “ + output);
      } // end while
   } // end main()

   public static String getString() throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
   }