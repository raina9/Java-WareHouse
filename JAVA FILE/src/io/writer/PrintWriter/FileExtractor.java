//Wap to delete data present in one file from another and then write in newfile
package io.writer.PrintWriter;

import java.io.*;

public class FileExtractor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("FilextOut.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("FilextIn.txt"));
		String line = br1.readLine();
		while (line != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("FilextDel.txt"));

			String target = br2.readLine();
			while (target != null) {
				if (line.equals(target)) {
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if (available == false) {
				pw.println(line);
			}
			line = br1.readLine();
		}
		pw.flush();
	}
}