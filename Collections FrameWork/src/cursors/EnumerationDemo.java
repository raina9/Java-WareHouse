package cursors;

import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector v = new Vector();
        for (int i = 0; i <=10; i++) {
			v.addElement(i);
		}
        System.out.println(v);
        //If we want to get object one-by-one we need Cursor
        Enumeration e = v.elements();
        // v.elements present in vector class used to create enumeration object
        while(e.hasMoreElements())
        {
        	Integer i = (Integer)e.nextElement();
        	if(i%2==0)
        		System.out.println(i);
        }
        	
	}

}
