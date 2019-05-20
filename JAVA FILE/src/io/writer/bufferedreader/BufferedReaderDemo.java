package io.writer.bufferedreader;
import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
        FileReader fr = new FileReader("BufferedReaderTest.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line!=null)
        {
        	System.out.println(line);
        	line = br.readLine();
        }
        br.close();
        System.out.println("done");
	}

}
