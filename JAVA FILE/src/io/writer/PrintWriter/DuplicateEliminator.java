package io.writer.PrintWriter;
import java.io.*;
public class DuplicateEliminator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        PrintWriter pw = new PrintWriter("duplout.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("duplin.txt"));
	    
        String line = br1.readLine();
        while(line!=null)
        {
        	boolean available = false;
        	BufferedReader br2 = new BufferedReader(new FileReader("duplout.txt"));
        	String target = br2.readLine();
        	       while(target!=null)
        	       {
        	    	   if(line.equals(target))
        	    	   {
        	    		   available = true;
        	    		   break;
        	    	   }
        	    	   target = br2.readLine();
        	       }
        	       if(available==false)
        	       {
        	    	   pw.println(line);
        	    	   pw.flush();
        	       }
        	       line = br1.readLine();
        }
	}

}
