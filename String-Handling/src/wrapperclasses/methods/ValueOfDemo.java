package wrapperclasses.methods;
/**
 * 
 * @author raina
 *methods present in WrapperClass
 *valueOf similar to constructor creates wrapper classes for given primitive or string
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ValueOf()
		/**
         * Form-1 : public static Wrapper valueOf(String s)
         *  it is a static method
         *  except character as it doesn't have string arg. constructor
         *  we can call valueOf() direct via class name
         */
	    Integer i = Integer.valueOf("11111");
	    System.out.println("valueOf"+" "+i);
	    
	    /**
	     * Form-2 : public static Wrapper valueOf(String s,int radix)
	     * to convert integral String into given base
	     * applicable only for integral types  
	     */
	   
	    Integer i1 = Integer.valueOf("10101",2);
	    System.out.println("valueOf-Radix"+" "+i1);
	    
	    /**
	     * Form-3 : public static Wrapper valueOf(primitive p)
	     * applicable for all type of wrapper classes
	     */
	    Integer i2=  Integer.valueOf(10);
	    System.out.println("valueOf-primitive"+" "+i2);
	}
}
