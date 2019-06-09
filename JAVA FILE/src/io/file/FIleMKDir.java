package io.file;

import java.io.*;

public class FIleMKDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("shivendra123");
		System.out.println(f.exists());
		f.mkdirs();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath()); // to check the path

	}

}
