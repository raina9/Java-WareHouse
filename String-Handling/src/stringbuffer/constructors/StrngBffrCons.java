/**
 * 
 */
package stringbuffer.constructors;

/**
 * @author raina
 *constructors in StringBuffer
 *Capacity and length 
 */
public class StrngBffrCons {
public static void main(String [] args)
{
	StringBuffer sb = new StringBuffer();
	/**
	 * capacity : how many characters we can insert 
	 */
	System.out.println("default capacity"+" "+sb.capacity());
	sb.append("Shivendra mohan raina");
	System.out.println("capacity after adding character"+sb.capacity());
	System.out.println("length of string"+" "+sb.length());
	
}
}
