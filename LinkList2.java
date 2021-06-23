class link {
   public int iData;
   public double dData;
   public Link next;
   
   public Link(int id, double dd ){
      iData = id;
      dData = dd;
      next = null; //not compulsary required 
   }
   
   public void dislayLink() {
      System.out.println("{" + iData + ", " + dData + "}");
   }
}

class LinkList {
   private Link first;
   
   public void LinkList() {
      first = null;
   }
   
   public boolean isEmpty(){
    //   if(first == null){
//          System.out.println("the list is empty");
//       }

         return(first == null);
   }
   
   public void insertBegin() {
      Link newLink = new Link(id, dd);
      newLink.next = first //the first is shifted to next link
      first = newLink;     //and the newlink which is now the first element     
   }
   
   public Link deleteBegin() {
    //first call the empty fuc to check if the list exists
      Link temp;
      temp = first;
      first = first.next;
      return temp;  //return deleted link
   }
   
   public void displayList() {
      Link current;
      while(current != null) {
         current.displayLink();
         currecnt = curret.next;
      }
      System.out.println("");
   }
}

class LinkListApp {
   public static void main(String [] args) {
      LinkList theList = new LinkList;
      
      theList.insertBegin(22, 2.99);
      theList.insertBegin(44, 4.99);
      theList.insertBegin(66, 6.99);
      theList.insertBegin(88, 8.99);
      
      nList.displayList();
      
      Link aLink = theList.deleteBegin();  
      aLink.displayLink(); 
      
      theList.displayList();
   }
}