package io.writer.bufferedwriter;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("BufferedWriterDemo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();// problem of \n overcame using BR
		char[] ch1 = { 'a', 'b', 'c', 'd' };
		bw.write(ch1);
		bw.newLine();
		bw.write("raina");
		bw.newLine();
		bw.write("software developer trainee");
		bw.flush();
		bw.close();
		System.out.println("done");
	}

}
