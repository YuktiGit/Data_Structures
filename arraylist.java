import java.util.*;
class arraylist{
   public static void main(String args[]){
      ArrayList<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      int choose = 0;
      do{
         System.out.println(" Enter 1 to add a string.");
         System.out.println(" Enter 2 to delete element from list.");
         System.out.println(" Enter 3 to Display list.");
         System.out.println(" Enter 4 to Exit.");
         choose = sc.nextInt();
         switch(choose){
            case 1:
               System.out.print("Enter a string:  ");
               String p = sc.next();
               list.add(p);
               break;
            case 2:
               System.out.print("Enter a index value:  ");
               int w = sc.nextInt();
               list.remove(w);
               break;
            case 3:
               System.out.println("Elements of list.  ");
               System.out.println(list);
            default:
               break;
         }
      }while(choose != 4);
   }
}