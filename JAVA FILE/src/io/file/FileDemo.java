package io.file;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File f = new File("abc.txt");
		File f = new File("/home/raina/Desktop", "testfile.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath()); // to check the path
	}

}
