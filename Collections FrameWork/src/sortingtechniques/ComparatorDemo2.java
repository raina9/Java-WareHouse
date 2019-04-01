package sortingtechniques;

import java.util.*;

public class ComparatorDemo2 {
   
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
    	  //for customised sorting we need to give implementation to comapre method
    	  public int compare(Object obj1,Object obj2)
 	     {
 			Integer I1 = (Integer)obj1;
 			Integer I2 = (Integer)obj2;
 			if(I1<I2)
 				return 1;
 			else if(I1>I2)
 			    return -1;
 			else
 			    return 0;
 	     }

}
