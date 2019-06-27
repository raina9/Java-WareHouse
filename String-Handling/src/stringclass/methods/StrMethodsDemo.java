package stringclass.methods;

public class StrMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shivendra mohan raina";
		// 1.public char charAt()
		System.out.println(s.charAt(7));
		// System.out.println(s.charAt(30)); // throws StringIndexOutOfBoundsException

		// 2.public string concat()
		String s1 = s.concat("golu");
		String s2 = s + "bhai";
		System.out.println("concat : " + " " + s1);
		System.out.println("Operator-overloading : " + " " + s2);
       
		
		  //3.public boolean equals(Object obj)
		 
		 /* responsible for object comparison
		 * it is overidden in case of String for content comparison
		 */
		String s4 = "shivendra";
		String s5 = "shivendra";
 		String s6 = "Shivendra";
		System.out.println(".equals() overridden"+" "+s4.equals(s5));
		System.out.println(".equals() overridden"+" "+s4.equals(s6));
		
		//4. '==' operator responsible for primitive as well as object comparison
		
		System.out.println("double equals operator"+" "+s4==s5);
		System.out.println("double equals operator"+" "+s4==s6);
 		
		// 5.public boolean EqualsIgnoreCase(String s)
		String s7 = "JAVA";
		System.out.println(".equals()" + " " + s7.equals("java"));
		System.out.println(".equalsIgnoreCase()" + " " + s7.equalsIgnoreCase("java"));

		// 6.public string substring()
		System.out.println(s.substring(3, 18));
		// System.out.println(s.substring(5,25)); //throws StringIndexOutOfBoundsException

		// 7.public int length()
		System.out.println("length() method" + s.length());

		// 8.public String Replace(char oldch,char newch)
		String s8 = "brijnath";
		System.out.println("String Replace" + " " + s8.replace('b', 'n'));

		// 8.public string toUpperCase()
		System.out.println("toUpperCase" + " " + s.toUpperCase());

		// 9.public string toLowerCase()
		System.out.println("toLowerCase" + " " + s.toLowerCase());
	    
		//10.public string Trim()
		String s9 = "         shivendra raina mohan        ";
		String s10 = s.trim();
		System.out.println("Blank Spaces Removed"+" "+s10);
		
		//11.public int IndexOf()
		int s11 = s.indexOf('e');
		int s12 = s.lastIndexOf('o');
		System.out.println("IndexOf"+" "+s11);
		System.out.println("LastIndexOf"+" "+s12);
	}
}
