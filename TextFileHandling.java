package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileHandling {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\JavaEclipse\\JavaBasics\\sampleResume.txt");
	if(!f.exists())
	{
		f.createNewFile();
	}
	FileInputStream file=new FileInputStream(f);
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

