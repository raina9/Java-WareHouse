package sortingtechniques;

//various results on different ways to return objects 
import java.util.*;

public class ComparatorDemo3 {

	public static void main(String args[]) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(23);
		t.add(15);
		t.add(14);
		t.add(0);
		t.add(11);
		t.add(15);
		System.out.println(t);
	}
}

class MyComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		// we have provided implementation to comparator interface but inside compare we
		// can also call compareTo() it follows DNSO
		return I2.compareTo(I1);
		// return -I2.compareTo(I1);
		// return I1.compareTo(I2);
		// return -I1.compareTo(I2);
		// return -1;
		// return +1;
		// return 0;
	}
}
