// WAP to merge data from two files into one new file 

package io.writer.PrintWriter;

import java.io.*;

public class FileMerger {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("filemereged.txt");
		BufferedReader br = new BufferedReader(new FileReader("FileMerger1.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("FileMerger2.txt"));// to add data in continuation and avoid overriding
																	// old object is used
		line = br.readLine();
		while (line != null) {
			pw.println();
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
