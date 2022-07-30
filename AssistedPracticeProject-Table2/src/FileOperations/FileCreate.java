package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate 
{
	public static void main(String[] args) throws IOException 
	{
		String path="D:\\CompanyProject\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fname=sc.next();
		String finalpath=path+fname;
		File f = new File(finalpath);
		boolean bo = f.createNewFile();
		if(bo!=true)
		{
			System.out.println("File created successfully");
		}
		FileWriter fw = new FileWriter(finalpath); //FileOutputStream fos = new FileOutputStream(finalpath);
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter content");
		String fcontent= scc.nextLine();
		//byte b[] =fcontent.getBytes();
		fw.write(fcontent); ///fos.write(b);
		System.out.println("content written");
		fw.close();
	}
}
