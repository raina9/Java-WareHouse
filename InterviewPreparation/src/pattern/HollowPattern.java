package pattern;

public class HollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=1;
		int x=0;
		for(int i=1;i<=n;i++)
	        {
			x=0;
	        	for(int j=1;j<=n-i;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        	for(int j=1;j<=2*i-1;j++) 
	        	{
	        		k=j<=i?(x++):(x--);
	        		System.out.print(x);
	        	}
	          	System.out.println();
	        }

	}

}
