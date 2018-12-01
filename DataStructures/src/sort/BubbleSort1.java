package sort;//problem in out
import java.util.Scanner;
public class BubbleSort1 {
      
	public static int[] bubble(int d[],int z)
       {
    	   int temp=0;                               
    	   for(int i=0;i<z-1;i++)                    
    	   {                                         
    	  for(int j=0;j<z-1-i;j++)                   
    		   {                                     
    		  if(d[j]>d[j+1])                        
    			   {                                 
    				   temp=d[j];                    
    				   d[j]=d[j+1];                  
    				   d[j+1]=temp;                  
    			   }
    		   }
    	   }
          return d;
       }
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int array[]=new int[size];
        
        for(int i=0;i<array.length;i++)
        {
     	   System.out.println("enter the random elements");
     	   array[i]=sc.nextInt();
       }
        System.out.println("array before sorting");
        for(int k=0;k<array.length;k++)
        {
     	   System.out.print(array[k]+" ");
        }
        System.out.println();
        int b[]=bubble(array,size);
        
        System.out.println("array after sorting");
        for(int k=0;k<b.length;k++)
        {
     	   System.out.print(b[k]+" ");
        }
        
	}

}
