package javaIOPackage;
import java.io.*;
public class FileInput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("/media/ashish/New Volume/javaText/Hello.txt");
			int i = fin.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = fin.read();
			}
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
