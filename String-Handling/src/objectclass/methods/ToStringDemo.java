/**
 * 
 */
package objectclass.methods;

/**
 * 
 * ToString() --- Object class
 * 
 * @author raina
 * 
 */
public class ToStringDemo {
	String name;
	int rollno;

	ToStringDemo(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	/**
	 * implementation of object class toString() method by JVM public class String
	 * toString() { return getClass().getName()+"@"+toHexString(HashCode()); }
	 */
	
	
	/**
	 * overriding ToString() Method
	 * public String toString()
	 */
	  public String toString()
	  {
		return name+"--"+rollno;
	  }
	   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringDemo s1 = new ToStringDemo("Shivendra", 101);
		ToStringDemo s2 = new ToStringDemo("Mohan", 10);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}

}
