package collections.Set;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedHashSet lhs = new LinkedHashSet();
     lhs.add("B");
     lhs.add("C");
     lhs.add("A");
     lhs.add("D");
     lhs.add("Z");
     lhs.add(null);
     lhs.add(10);
     System.out.println(lhs.add("Z"));
     //Insertion order is preserved it means O/P will be in same order as inserted"
     System.out.println(lhs);
	}

}
