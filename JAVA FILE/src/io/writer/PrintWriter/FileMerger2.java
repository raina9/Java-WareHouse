//wap to merge 2 file into a newfile merged alternately

package io.writer.PrintWriter;

import java.io.*;

public class FileMerger2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("FileAltMerge.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("FileAlter1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("FileAlter2.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while ((line1 != null) || (line2 != null)) {
			if (line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}
			if (line2 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
		}
		pw.flush();
		pw.close();
		br1.close();
		br2.close();

	}

}
