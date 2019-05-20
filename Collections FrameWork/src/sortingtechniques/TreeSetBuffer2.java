package sortingtechniques;

import java.util.*;

public class TreeSetBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());//when comparator object is not provided since Buffer do not follow DNSO hence We will get CCE                                                             
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("C"));
		System.out.println(t);
	}
	}
	class MyComparator implements Comparator 
	{
		public int compare(Object Obj1,Object Obj2)
		{
			String s1 = Obj1.toString();
			String s2 = Obj2.toString();
			
			return s1.compareTo(s2);
		}
	}


