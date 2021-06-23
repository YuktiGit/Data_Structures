
class LinkList {
   public int id;
   public double dd;
   public Link next;
   private Link first;
    
   LinkList(int iD, double dD) {
      id = iD;
      dd = dD;
   }
   LinkList() { 
      first = null;
   }
   
   displayLink() {
      System.out.print("{" + id + ", " + dd + "} ");
   }
   
   insertFirst(int id, double dd) {
      Link newLink = new Link(id, dd);
      newLink.next = first;
      first = newLink;
   }
   
   isEmpty() {
      return (first == null);
   }
   
   deletFirst() {
      Link temp = first;
      first = first.next; 
      return temp;
   }
}

class LinkListApp {
   public static void main(String [] args) {
      LinkList theList = new LinkList();
      
      theList.insertFirst(22, 2.99);
      theList.displayList();
      
      while(!theList.isEmpty()) {
         Link aLink = theList.deleteFirst();
         System.out.print("deleted");
         aList.displayLink();
         System.out.println("");
      }   
      theList.displayLink();
   }
}