package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WithFileReader {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\JavaEclipse\\JavaBasics\\sampleResume.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileReader file=new FileReader(f);
		int Ascii;
		String text="";
		while((Ascii=file.read())!=-1)
		{
			text=text+String.valueOf((char)(Ascii));
		}
		System.out.println(text);
		file.close();
	}
}

