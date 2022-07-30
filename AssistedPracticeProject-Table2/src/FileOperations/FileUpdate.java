package FileOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUpdate 
{
	public static void main(String[] args) throws IOException {
		String path="D:\\CompanyProject\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fname=sc.next();
		String finalpath=path+fname;
		FileWriter fw = new FileWriter(finalpath,true);
		Scanner scc= new Scanner(System.in);
		System.out.println("enter content to update");
		String newcontent = scc.nextLine();
		fw.write(newcontent);
		System.out.println("------content updated----");
		fw.close();
	}
}
