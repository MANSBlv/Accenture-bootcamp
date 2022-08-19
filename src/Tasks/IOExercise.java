package Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class IOExercise {

	public static void main(String[] args) {
		//13. Write a java program to read a file line by line and store it into a variable
		File myFile = new File("resource/file.txt");
		/*	String res = "";
		try {
			Scanner scan = new Scanner(myFile);
			while(scan.hasNextLine()) {
				res += scan.nextLine();
			}
			scan.close();
			System.out.println(res);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//7.Write a Java program to get last modified time of a file.
		Date date = new Date(myFile.lastModified());
		System.out.println(date);
	*/	
		//Exercise-15
	/*	try {
			FileWriter fileWriter= new FileWriter(myFile,false);
			fileWriter.write("Random text");
			fileWriter.close();
			String result="";
			Scanner scan = new Scanner(myFile);
			while(scan.hasNextLine()) {
				result+=scan.nextLine();
			}
			System.out.println(result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		
		//Exercise-1
		
		File[] list = File.listRoots();
		for (File file : list) {
			System.out.println(file);
		}
	}

}
