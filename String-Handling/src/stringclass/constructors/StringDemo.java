package stringclass.constructors;

/**
 * @author raina
 * String class constructors
 */
public class StringDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       String s = new String();
       
       
         String s1 = new String("hello world");     //literals
         //String s2 = new StringDemo(StringBuffer sb);   //string object for equivalent string buffer
         //String s3 = new String(char[] ch);         //string object for char Array 
         char[] ch = {'g','o','l','u'};
         String cts = new String(ch);
         System.out.println("char to String"+" "+cts);  
         
         
        //String s4 = new String(byte[] b);     //string object for byte Array
       byte[] b = {100,101,102,103,104,105,106,107,108,109,110};
        String bts = new String(b);
        System.out.println(bts);
    }

}
