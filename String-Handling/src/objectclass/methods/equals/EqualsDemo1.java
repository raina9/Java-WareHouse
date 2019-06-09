package objectclass.methods.equals;

import java.util.*;

/**
 * 
 * @author raina Overriding .equals() method for content comparision
 */

public class EqualsDemo1 {
	String name;
	int rollno;

	EqualsDemo1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}switch(int j)
	{
		case 1:
		{
			
		}
		break;
     	case 2:
	{

	public boolean equals(Object obj) {
		String name1 = this.name;
		int rollno1 = this.rollno;
		// 2nd object coming as argument needed to be typecasted
		EqualsDemo1 e = (EqualsDemo1) obj;
		String name2 = e.name;
		int rollno2 = e.rollno;
		if (name1.equals(name2) && rollno1 == rollno2)// rollno is primitive in nature
		{
			return true;
		} else {
			return false;
		}
		break;
	}

	}}

public static void main(String[] args)
   { 
	EqualsDemo e1 = new EqualsDemo("golu",100);
	EqualsDemo e2 = new EqualsDemo("Raina",101);
	EqualsDemo e3 = new EqualsDemo("golu",100);
    EqualsDemo e4 = e1;
    
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1.equals(e4));
    
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
    System.out.println("Enter the choice of number"+i);
    System.out.println("1 for object class .equals()"); 
    System.out.println("2 for overridden .equals()");

   }
}
