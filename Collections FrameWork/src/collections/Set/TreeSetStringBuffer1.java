package collections.Set;

//special case of StringBuffer
import java.util.*;

public class TreeSetStringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		// everything is fine but we will get RTE:CCE because StringBuffer is not
		// comparable hence DNSO will not be followed
		System.out.println(t);
	}

}
