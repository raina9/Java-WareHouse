package sortingtechniques;

import java.util.TreeSet;

public class TreeSetBuffer1 {
	public static void main(String args[]) {
		TreeSet t = new TreeSet();// when comparator object is not provided since Buffer do not follow DNSO hence
									// We will get CCE
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("C"));
		System.out.println(t);
	}
}
