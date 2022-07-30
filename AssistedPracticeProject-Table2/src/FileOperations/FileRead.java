package FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		String path="D:\\CompanyProject\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fname=sc.next();
		String finalpath=path+fname;
		FileInputStream fis = new FileInputStream(finalpath);
		if(fis!=null)
		{
			System.out.println("file exist in: "+path);
		}
		else
		{
			System.out.println("check file name ,entered file name doesnot exist");
			
		}
		int i=0;
		//-1 is EOF
		System.out.println("File content is--------");
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}
		fis.close();

	}

}
