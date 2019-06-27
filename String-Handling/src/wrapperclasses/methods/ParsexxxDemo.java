package wrapperclasses.methods;
/**
 * 
 * @author raina
 * responsible for conversion of String to primitive
 */
public class ParsexxxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //every wrapper class except character contains one static method
		//Form-1: public static PrimitiveParsexxx(String s)
		int i = Integer.parseInt("10");
		boolean b = Boolean.parseBoolean("True");
		double d = Double.parseDouble("10.5");
		System.out.println("parseInt"+" "+i);
		System.out.println("parseBoolean"+" "+b);
		System.out.println("parseDouble"+" "+d);

		/**
		 * Form-2 : public static PrimitiveParsexxx(String s,int radix)
		 * to convert Specified string radix to primitive
		 */
		int i1 = Integer.parseInt("11111",2);
	    System.out.println("parseInt-radix"+" "+i1);
	}

}
