package wrapperclasses.methods;

/**
 * 
 * @author raina
 * converts wrapper classes to primitives
 */
public class xxxValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    //xxxValue()
	    /**
	     * TOTAL 38 method are possible including all wrapper class
	     *Form-1 : For Integer
	     * public <NumberType> <NumberType>value()
	     * public byte byteValue()
	     * Applicable only for NumberType Wrapper Classes 
	     */
	    Integer i3 = new Integer(1008);
	    System.out.println("byte"+" "+i3.byteValue());
	    System.out.println("short"+" "+i3.shortValue());
	    System.out.println("int"+" "+i3.intValue());
	    System.out.println("float"+" "+i3.floatValue());
	    System.out.println("long"+" "+i3.longValue());
	    System.out.println("double"+" "+i3.doubleValue());
	
	   /**
	    * Form-2 : For Character
	    * public char charValue()
	    */
	    Character ch = new Character('a');
	    char c1 = ch.charValue();
	    System.out.println("charValue"+" "+c1);
       
	    /**
	     * Form-3 : For Boolean
	     * public boolean booleanValue()
	     */
	    //wrapperclass boolean return type
 	     Boolean b1 = Boolean.valueOf("Shivendra"); 
	    //primitive boolean	return type
	    boolean b2 = b1.booleanValue();            
	   System.out.println(b2);
	}

}
