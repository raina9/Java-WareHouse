package collections.List;

import java.util.*;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList l = new LinkedList();
      l.add("durga");
      l.add("30");
      l.add(null);
      l.add("durga");
      System.out.println("1"+" "+l);
      l.set(0,"software");
      System.out.println("2"+" "+l);
      l.set(0,"venki");
      System.out.println("3"+" "+l);
      l.removeLast();
      l.addFirst("ccc");
      System.out.println("4"+" "+l);
	}

}
