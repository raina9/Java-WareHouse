package collections.Set;

import java.util.*;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("a");
        t.add("Z");
        t.add("L");
        //there is need of comparison so heterogeous and null value are not allowed
      //t.add(new Integer(10));// heterogeneous object not allowed 
	  //t.add(null);//NPE 
       //O/P follows D.N.S.O
        System.out.println(t);
	}

}
