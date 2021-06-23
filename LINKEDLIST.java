class link {
   public int iData;
   public double dData;
   public Link next;


   public Link(int id, double dd){
      iData = id;
      dData = dd;
      //next is automatically set to null
   }
   
   public void displayLink(){
      System.out.println("{" + iData + ", " + dData + "} ");
   }

   public void insertFirst(){
      Link someLink = new Link(id, dd);
      someLink.next = first;             //somelink-->oldfirst
      first = someLink;                  //first-->somelink
   
   }
   
   public Link deleteFirst(){
      Link temp = first;
      first = first.next;
      return temp;
   }

}
