package wrapperclasses.constructors;
/**
 * 
 * @author raina
 *to wrap primitive into object form so that we can handle primitives just like objects
 */
public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * constructors in wrapper class 
		 * accepts two arguments 1 for type and 1 as string 
		 */
		try {
		int i1= 10;
		/**
		 * 1.Constructor for Integer
		 * contains two constructor 
		 * 1.takes integer arguments
		 * 2.takes String arguments
		 */
		
	   Integer i2 = new Integer(10); //--integer argument
		
       System.out.println("primitive"+" "+i1);
       System.out.println("wrapperclass"+" "+i2);
       
       Integer i3 = new Integer("20"); //--String argument
       
       //case of R.T.E.
       Integer i4 = new Integer("ten");
	  //if string argument doesn't represents a number then we will get RTE: Number Format Exception	
		
       //Integer i5 = new Integer(10l);
       //Integer class doesn't contains constructor for long 
		}
		
		catch(Exception e)
		{
			System.out.println("when string argument doesn't represents a number ");
			System.out.println(e);
		}
		/**
		 * 2.Constructor for Float
		 * contains three constructor 
		 * 1.takes integer as arguments
		 * 2.takes float as arguments 
		 * 3.takes double as arguments
		 */
		 Float f = new Float(10.5f);
		 Float f1 = new Float("11.5f");
		 Float f2 = new Float(10.5);
		 System.out.println("float as argument : "+" "+f);
		 System.out.println("string as argument : "+" "+f1);
		 System.out.println("double as argument : "+" "+f2);         		 
		  
		 /**
		  * 3.Constructor for Character
		  * contains only one constructor for character literal
		  */
		  Character ch = new Character('a');
		  /**
		   * Character ch1 = new Character("a"); 
		   * it doesn't allows string as argument 
		   */
	
           /**
            * 4.Constructor for Boolean
            * contains two constructor 
            * 1.takes boolean arguments
		    * 2.takes String arguments
            */
		   Boolean X = new Boolean("yes"); 
		   Boolean Y = new Boolean("no");
		   System.out.println(X+"---"+Y);
		   System.out.println("boolean"+X.equals(Y));
		
		   /**
		    * anything except True or TRUE is false
		    * hence yes no is false  
		    */
		 
	}
}
