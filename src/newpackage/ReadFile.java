package newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj = new File("filename1.txt");
			Scanner Reader = new Scanner(obj);	
			while(Reader.hasNextLine()){
			String data = Reader.nextLine();
			System.out.println(data);
			}
		Reader.close();
		
		} catch(FileNotFoundException e) {
		System.out.println("An error occured");
		e.printStackTrace();
		}
	}
}