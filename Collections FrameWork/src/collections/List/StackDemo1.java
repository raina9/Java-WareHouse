package collections.List;

import java.util.*;

public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("B"));
		System.out.println(s.search("Z"));
	}

}
