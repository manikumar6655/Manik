package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WithScanner {
	public static void main(String[] args) throws Throwable {

		File f=new File("C:\\JavaEclipse\\JavaBasics\\sampleResume.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		String text=new String();
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			text+=sc.nextLine()+"\n";


		}
		System.out.println(text);

		sc.close();
	}
}