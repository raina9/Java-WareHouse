package io.writer.filewriter;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// FileWriter fw = new FileWriter("FileWriterDemo.txt");
		FileWriter fw = new FileWriter("FileWriterDemo.txt", true);// to allow append data
		fw.write(100); // converts into char value
		fw.write("raina \n shivendra"); // to avoid conversion write in string form
		fw.write("\n");
		char[] ch1 = { 'r', 'a', 'i', 'n', 'a' };
		fw.write(ch1);
		fw.write("\n");
		fw.flush();
		fw.close();
		System.out.println("done");
	}
}
