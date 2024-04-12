package finalPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Piyush\\Documents\\homework\\Demofile.txt";
		String fileName1 = "C:\\Users\\Piyush\\Documents\\homework\\Output.txt";
		
		File f  = new File(fileName);
		File f1  = new File(fileName1);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String Line = null;
		List<String> ls = new ArrayList<String>();
		while((Line=br.readLine()) != null) {
				System.out.println(Line);
				ls.add(Line);
		}
		System.out.println(ls);
		FileWriter fw = new FileWriter(f1);
		
		for(int i=ls.size()-1; i>0; i--) {
			fw.write(ls.get(i));
			fw.write("\n");
		}
		fw.flush();
		fr.close();
	}

}
