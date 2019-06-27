package stringbuffer.methods;

public class StrBffrMethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer("shivendra");
        //1. public char charAt(int index)
        System.out.println(sb.charAt(4));
        //System.out.println(sb.charAt(70)); //StringIndexOutOfBounds
        
        //2.public void setcharAt(int index,char ch)
        sb.setCharAt(5,'d');
        System.out.println(sb);
        
        /**
         * 3. .equals()method
         * in case of string buffer it is not overridden so it will compare references
         */
        String s1 = new String("mohan");
        
        StringBuffer sb1 = new StringBuffer("golu");
        StringBuffer sb2 = new StringBuffer("golu");
        System.out.println("String Buffer .equals() : "+" "+sb1.equals(sb2));
        System.out.println(sb1==sb2);
        
        /********************************************/
        //case of typemismatch
        System.out.println(s1.equals(sb1)); //it gives false for different types
        //System.out.println(s1==sb1);  //it gives C.T.E: Incomparable Type 
        /********************************************/
        
        /**
         * 4.public StringBuffer Append(String s)
         * it is an overridden method
         */
        StringBuffer sb3 = new StringBuffer();
        //overriden for string 
        sb3.append("Pi value is : ");
	    //overridden for float
        sb1.append(3.14);
	    sb3.append("It is Exactly : ");
	    //overridden for boolean
	    sb3.append(true);
	    System.out.println("StringBuffer Append() : "+" "+sb3);
       
	    //5.public StringBuffer Insert()
	    StringBuffer sb4 = new StringBuffer("shivendra");    
	    sb4.insert(5,"[golu]");
	    sb4.insert(4, 'k');
	    System.out.println("StringBuffer Insert()"+sb4);
	   
	    //6.Delete() ---deletes from begin to end-1
	    //6.1 public StringBuffer delete(int begin, int end)
	    StringBuffer sb5 = new StringBuffer("gameofthrones");
	    sb5.delete(4,7);
	    System.out.println("StringBuffer delete() : "+" "+sb5);
	    //6.2 public StringBuffer delete charAt(int index)
	    StringBuffer sb6 = new StringBuffer("raaina");
	    sb6.deleteCharAt(2);
	    System.out.println("StringBuffer delete charAt() : "+" "+sb6);
        
	    //7.public StringBuffer reverse();
	    StringBuffer sb7 = new StringBuffer("quantum of solace");
	    sb7.reverse();
	    System.out.println("StringBuffer reverse() : "+" "+sb7);
	   
	    //8.public void setLength(int length) --- only picks 0 to end-1 index
	    StringBuffer sb8 = new StringBuffer("shivendra mohan raina");
	    sb8.setLength(9);
	    System.out.println("StringBuffer setLength() : "+" "+sb8);
	    
	    //9.public void ensureCapacity() ----increases capacity on demand
	    StringBuffer sb9 = new StringBuffer();
	    System.out.println("DefaultCapacity() : "+" "+sb9.capacity());
	    sb.ensureCapacity(100);
	    System.out.println("ensureCapacity() : "+" "+sb.capacity());
	   
	    //10.public void trimToSize() ----removes extra space of memory  
	    StringBuffer sb10 = new StringBuffer("golu");
	    System.out.println(sb10.capacity());
        sb10.trimToSize();
        System.out.println("trimToSize()"+" "+sb10.capacity());
	} 
}
