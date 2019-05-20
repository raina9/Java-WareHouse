package sortingtechniques;
import java.util.*;
public class CompStringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet t = new TreeSet(new MyComparator());
      t.add("golu");
      t.add("shivendra");
      t.add("mohan");
      t.add("bhaiya");
      t.add("papa");
      t.add("bike");
      System.out.println(t);
	}

}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}

