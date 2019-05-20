package io.file;
import java.io.*;
public class FileMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     int count = 0;
     File f = new File("/home/raina/Downloads");
     File f2 = new File("ShivendraMohan-7.1 (1).pdf");
     String[] s = f.list();
     for(String s1:s) 
     {
    	 File f1 = new File(f,s1);
    	 //if(f1.isDirectory())
        // if(f1.isFile())
    	 count++;
    	 System.out.println(s1);
     }
     System.out.println("number of files:"+count);
    }

}
