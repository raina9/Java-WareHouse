package pattern;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=1;
		int k=15;
		int j=0;
        for(int i=1;;i++)
        {
        	
        	for(j=1;j<=i;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        	if(j==k)
        	{
        		break;
        	}
        	m++;
        }
	}

}
