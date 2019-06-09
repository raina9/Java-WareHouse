package objectclass.methods;

import java.lang.reflect.*;

public class MethodPresent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method m[] = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName() + "-------" + m1.getReturnType());

		}
		System.out.println("the number of method present" + "---" + count);
	}

}
