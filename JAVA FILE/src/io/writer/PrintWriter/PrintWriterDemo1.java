package io.writer.PrintWriter;

import java.io.*;

public class PrintWriterDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("PrintWriterDemo1.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100); // transform into character
		out.println(100); // doesn't transforms into char,prints exact value as passed
		out.println(true);
		out.println('c');
		out.println("durga");
		out.println("golu");
		out.flush();
		out.close();
		System.out.println("done");
	}

}
