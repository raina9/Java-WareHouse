package cursors;
import java.util.*;

public class InternalImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector v = new Vector();
       Enumeration e  = v.elements();
       Iterator i = v.iterator();
       ListIterator ltr = v.listIterator();
       System.out.println("The output comes is in inner class format");
       System.out.println("1."+" "+e.getClass().getName()+" "+":"+"if O/P comes integer it means it's an anonymous inner class");
       System.out.println("2."+" "+i.getClass().getName());
       System.out.println("3."+" "+ltr.getClass().getName());
	}

}
