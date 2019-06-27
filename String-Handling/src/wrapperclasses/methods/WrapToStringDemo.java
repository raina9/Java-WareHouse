
package wrapperclasses.methods;

/**
 * @author raina
 * toString()
 */
public class WrapToStringDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Form.1- ObjectClass toString() 
		//toString() method present in Object class Prints Hexadecimal Representation of HashCode
		WrapToStringDemo t1 = new WrapToStringDemo();
		System.out.println("Hexadecimal Representation of HashCode : "+" "+t1);
       
		/**
		 * Form.2- public String toString()
		 * In Wrapper Class toString() is Overridden to return content directly
		 * Wrapper.toString() applicable for all Wrapper Classes
		 */
		Integer i = new Integer(10);
		/**
		 * it will print content instead of Hexadecimal Representation of HashCode
		 * S.O.P(i); internally S.O.P(i.toString()); will be called
		 */
		System.out.println("toString() Overidden" + " " + i);
         /**
          * Form.3- Primitive.toString()
          * public static String toString(Primitive p)
          * static method present in every WrapperClass to convert primitive into String
          */
		String s =  Integer.toString(10);
		String s1 = Boolean.toString(true);
		String s2 = Character.toString('a');
		System.out.println("Integer"+" "+s);
		System.out.println("Boolean"+" "+s1);
		System.out.println("Character"+" "+s2);
		
		/**
		 * Form.4-radix.toString()
		 * public static String toString(Primitive p,int Radix)
		 * only applicable for int and Long classes
		 */
		String s3 = Integer.toString(15,2);
		//applicable range of radix is 2 to 36
		System.out.println("radix.toString"+" "+s3);
		
		/**
		 * Form.5- to-xxxString()
		 * public static String to-xxxString(Primitive p)
		 * public static String toBinaryString(Primitive p)
		 * an advantage over public static String toString(Primitive p,int Radix)
		 * to avoid invalid  base conversion  
		 */
		String s4 = Integer.toBinaryString(1008);
		String s5 = Integer.toOctalString(1008);
		String s6 = Integer.toHexString(1008);
       
		System.out.println("Binary"+" "+s4);
		System.out.println("Octal"+" "+s5);
		System.out.println("HexaDecimal"+" "+s6);
	}

}
