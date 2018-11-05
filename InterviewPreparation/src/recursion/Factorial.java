package recursion;

public class Factorial {

	public static int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     int k=fact(n);
     System.out.println("hello");
     System.out.println(k);
	}

}
