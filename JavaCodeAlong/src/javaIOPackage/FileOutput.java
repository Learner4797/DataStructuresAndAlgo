package javaIOPackage;
import java.io.*;

public class FileOutput {


	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("/media/ashish/New Volume/javaText/Hello.txt");
//			fout.write(240);
			
			String str = "Hello java";
			byte arr[] = str.getBytes();
			
			
			fout.write(arr);
			fout.close();
			System.out.println("Success...");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
