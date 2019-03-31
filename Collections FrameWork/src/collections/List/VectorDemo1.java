package collections.List;

import java.util.*;

public class VectorDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector v = new Vector();
      System.out.println("Vector-Capacity"+" "+v.capacity());
      for(int i=1;i<=10;i++)
      {
    	  v.addElement(i);
      }
      System.out.println(v.capacity());
      v.addElement("A");
      System.out.println(v.capacity());
      System.out.println(v);
	}
}


