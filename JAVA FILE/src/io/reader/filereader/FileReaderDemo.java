package io.reader.filereader;
import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("FileWriterDemo.txt"); //provide any file name to read data 
		FileReader fr = new FileReader(f);
		 char[] ch = new char[(int)f.length()]; 
		//char[] ch = new char[f.length()];// give CTE possible loss of precision Type mismatch: cannot convert from long to int
		fr.read(ch);
		for(char ch1:ch)
		{
		System.out.println(ch1);	
		}
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        FileReader fr1 = new FileReader("FileWriterDemo.txt");
        int i = fr1.read();
        while(i!= -1)
        {
        	System.out.println((char)i);
        	i=fr1.read();
        }
        System.out.println("DONE");
       }
	}
