package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WithBufferReader {
public static void main(String[] args) throws IOException {
	
	//Number of lines in a File

			File f=new File("C:\\JavaEclipse\\JavaBasics\\sampleResume.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}
			int Ascii;
			String line=" ";
			String text=" ";
			int count=0;
			BufferedReader bw=new BufferedReader(new FileReader(f));
			while((line=bw.readLine())!=null)
			{
				text=text+String.valueOf(line)+"\n";
			}
			System.out.println(text);	
		}
}
