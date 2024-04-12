package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;//
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		 LinkedHashSet<String>linkedset = new LinkedHashSet<String>();
		
		linkedset.add("Piyush");
		linkedset.add("Mansi");
		linkedset.add("Mansi");
		linkedset.add("Piyush");// it is not taking duplicates
		
		for(String s : linkedset){
		System.out.println(s);
	}
	
	/*	ArrayList<Integer> number = new ArrayList<>();
		number.add(13);
		number.add(15);
		System.out.println(number);*/
		
	//	Set<String> name  = new LinkedHashSet<>();
		// name.add("p");
		// for( String s: name);{
	//System.out.println(name);
//	}

	/*	 HashSet<String>names1 = new LinkedHashSet<String>();
		
		names1.add("Pi");
		names1.add("Man");
		names1.add("Man");
		names1.add("Pi");// it is not taking duplicates
		
	
		for(String s: names1) {
			System.out.println(s);
	}*/
		
}
	
}	