package sortingtechniques;

import java.util.Comparator;
import java.util.*;

public class ComparatorDemo1 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet t = new TreeSet(new MyComparator()); //when we need customised sorting instead of DNSO
    	   t.add(10);
    	   t.add(0);
    	   t.add(15);
    	   t.add(5);
    	   t.add(20);
    	   System.out.println(t);
	}
}
      class MyComparator implements Comparator
	    {  
    	  //we need customised sorting but we don't provide implementation to 
    	  //Compare method then JVM will call compareTo() internally
    	  public int compare(Object obj1,Object obj2)
 	     {
 			return 0;
 	    	
 	     }

}
