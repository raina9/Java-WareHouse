package cursors;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("shivendra");
		l.add("raina");
		l.add("mohan");
		l.add("golu");
		l.add("papa");
		System.out.println(l);
		// If we want to get object one-by-one we need Cursor
		ListIterator<String> ltr = l.listIterator();
		// l.ListIterator() present in list interface to create ListIterator object of
		// given collection
		while (ltr.hasNext())// hasNext() checks for more element present
		{
			String s = ltr.next();// if elements presents it gives element
									// TypeCasting is done to change the object into String Type
			if (s.equals("golu")) {
				ltr.remove(); // remove object
			} else if (s.equals("raina")) {
				ltr.add("bhaiya");
			} else if (s.equals("mohan")) {
				ltr.set("Frankenstien"); // updates
			}
		}
	}

}
