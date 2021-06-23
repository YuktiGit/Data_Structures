//using single class
// display items 
for(j = 0; j < n; j++){
   System.out.println(arr[j]);
}

// find a given item
int searchkey;
for(j = 0; j < n; j++){
   if(arr[j] == searchkey){
      break
   }
}
if(j == n)
   System.out.pritnln("Can't find");
else
   System.out.println("found");
   
// delet an item 
int searchkey;
for(j = 0; j < n; j++){      //looking for the item
   if(arr[j] == searchkey){
      break;
   }
}
for(int k = j; k = n-1; k++){ // coping higher ones down
   arr[k] = arr[k+1];
   n--;
}

// Type 1 using diff class to perform functions
class LowClass{
   private long[] a;
   public LowClass(int size){
      a = new long[size];
   }
   public void setElem(int inde, long value){
      a[index] = value;
   }
   public long getElem(int idex){
      return a[index];
   }
}
class LowClassApp{
   LowClass arr = new LowClass(100);
   ar.getElem(j);
}   

// Type 2 using diff class to perform functions
class HighClass {
 private long [] a;
 private int n;
 
 public HighClass(int x){
   a = new long[x];
   n = 0;
 }
 
 public boolean find(long seachkey){}
 public void delet(long seachkey){}
 public long display(){}
}
class HighClassApp{
  HighClass arr = new HignClass(100);
  arr.delet(33);
  arr.display();
}

// one more way to find array(binary method)
public int find(long searchKey)
{
int lowerBound = 0;
int upperBound = nElems-1;
int curIn;
while(true){
   curIn = (lowerBound + upperBound ) / 2;
   if(a[curIn]==searchKey)
      return curIn; // found it
   else 
      if(lowerBound > upperBound)
         return nElems; // can’t find it
      else {  // divide range
         if(a[curIn] < searchKey)
            lowerBound = curIn + 1; // it’s in upper half
         else
            upperBound = curIn - 1; // it’s in lower half
        } // end else divide range
} // end while
} // end find()
