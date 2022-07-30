package FileOperations;

import java.io.File;
import java.util.Scanner;

public class FileDelete 
{
	public static void main(String[] args)
	{
		String path="D:\\CompanyProject\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file nameto be deleted: ");
		String fname=sc.next();
		String finalpath=path+fname;
		File f = new File(finalpath);
		f.delete();
		System.out.println("----file deleted successfully----");
	}
}
