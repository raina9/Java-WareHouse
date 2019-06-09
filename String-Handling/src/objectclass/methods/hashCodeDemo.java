package objectclass.methods;
/**
 * @author raina
 *
 */
public class hashCodeDemo {
    int i ;
    public hashCodeDemo(int i) {
	this.i=i;
    }
	//1.HashCode is not overridden then ObjectClass Hashcode works 
	//2.Overriding hashCode() Method
    // mind the spelling it's hashCode not HashCode()
   /**
    *  public int hashCode()
	{
		return i;
    }
    value return will be converted to hexadecimal
    */
    
    
	/**
	 * 3.Overriding hashCode() Method along with toString()
	 */
    public int hashCode()
    {
    	return i;
    }
    public String toString()
    {
    	return i+" ";
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       hashCodeDemo h1 = new hashCodeDemo(10);
       hashCodeDemo h2 = new hashCodeDemo(100);
       
       System.out.println(h1);
       System.out.println(h2);
	}

}
