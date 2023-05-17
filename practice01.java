package fileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class practice01 {
	public static void main(String[] args) throws IOException {
		//Absolute path
		//File f=new File("C:\\Users\\Dell\\OneDrive\\Desktop\\my doc\\mkresume.txt");


		//relative path
		//For Creating a file 

					File f=new File("C:\\JavaEclipse\\JavaBasics\\sampleResume.txt");
					if(f.exists())
					f.delete();
					System.out.println(f.createNewFile());



		//For creating a folder
					File f1=new File(".\\resume\\mk\\");
					System.out.println(f1.mkdirs());


		//For to get all files in a folder
					File f2=new File("C:\\JavaEclipse\\JavaBasics");
					System.out.println(Arrays.toString(f2.list()));



		//For to get all files path in a folder
					File f3=new File("C:\\JavaEclipse");
					System.out.println(Arrays.toString(f3.listFiles()));


		//for to get name of the file
		File f4=new File("C:\\JavaEclipse");
		System.out.println(f4.getName());
	}
}
