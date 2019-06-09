package stringclass.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "shivendra mohan raina";
        //1.charAt()
        System.out.println(s.charAt(7));
        //System.out.println(s.charAt(30)); // throws StringIndexOutOfBoundsException
        
        //2.concat()
        String s1 = s.concat("golu");
	    String s2=s+"bhai";
	    System.out.println("concat : "+" "+s1);
	    System.out.println("Operator-overloading : "+" "+s2);
	   
	    //3.EqualsIgnoreCase(String s)
	    String s3 = "JAVA";
	    System.out.println(".equals()"+" "+s3.equals("java"));
	    System.out.println(".equalsIgnoreCase()"+" "+s3.equalsIgnoreCase("java"));	    
	    
	    //4.substring()
	    System.out.println(s.substring(3, 18));
	    //System.out.println(s.substring(5,25)); //throws StringIndexOutOfBoundsException
	    
	    //5.length()
	    System.out.println("length() method"+s.length());
        
	    //6.String Replace(char oldch,char newch)
	    String s4 = "brijnath";
	    System.out.println("String Replace"+" "+s4.replace('b','n'));
	    
	    //7.toUpperCase()
	    System.out.println("toUpperCase"+" "+s.toUpperCase());
	    
	    //8.toLowerCase()
	    System.out.println("toLowerCase"+" "+s.toLowerCase());
	}

}
