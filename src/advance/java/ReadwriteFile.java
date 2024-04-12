package advance.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ReadwriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("src/advance/java/Files/sampledata.properties");
		
		FileReader fr = new FileReader(f);
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("session"));
		
		}
		// reading data from a text file
	
		public static void main2(String[] args) throws FileNotFoundException {
			
		File f = new File("path");
		Scanner fileReader = new Scanner(f);
		while(fileReader.hasNextLine()){
			System.out.println(fileReader.nextLine());
		
		}
		
		fileReader.close();
		
		
		
	}
	
	
	
	
	
	

}
