package objectclass.methods.equals;

/**
 * 
 * @author raina when we don't override .equals() method Object class .equals()
 *         method responsible for Reference Comparison
 */
public class EqualsDemo {

	String name;
	int rollno;

	EqualsDemo(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		EqualsDemo e1 = new EqualsDemo("golu", 100);
		EqualsDemo e2 = new EqualsDemo("Raina", 101);
		EqualsDemo e3 = new EqualsDemo("golu", 100);
		EqualsDemo e4 = e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}
}
