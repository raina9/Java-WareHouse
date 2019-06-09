package objectclass.methods;

import java.lang.reflect.Method;

public class GetClassDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int count = 0;
		// object ref. is used to hold Object as we don't know the type of object coming
		Object o = new String("shivendra");
		Class c = o.getClass();
		System.out.println("Fully Qualified ClassName" + " " + c.getName());
		Method m[] = c.getDeclaredMethods();
		System.out.println("Methods present :");
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName() + "-------" + m1.getReturnType());

		}
		System.out.println("the number of method present" + "---" + count);

	}

}
