package cursors;

import java.util.*;

public class IteratorDemo {
		public static void main(String[] args) 
	   {
		// TODO Auto-generated method stub
       ArrayList<Integer> l = new ArrayList<Integer>();
       for(int i=0;i<=10;i++)
       {
    	   l.add(i);
       }
       System.out.println(l);
     //If we want to get object one-by-one we need Cursor
       Iterator itr = l.iterator();
    // l.iterator() present in collection interface used to create Iterator object of give collection
       while(itr.hasNext())//hasNext() checks for more element present
       {
    	   Integer I = (Integer)itr.next();//TypeCasting is done to change the object into Integer Type
    	   if(I%2==0)
    	   {
    		   System.out.println(I);
    	   }
    	   else 
    	   {
    		   itr.remove();
    	   }
    	 }
       System.out.println(l);
	}

}
