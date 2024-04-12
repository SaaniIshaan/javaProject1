package Day4package;

import java.util.HashSet;

public class DuplicateElementsinArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"java","c","c++","python","java"};
		
	//Apporach1
	  
		boolean flag = false;
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element:" +arr[i]);
					flag = true;
					}
			}
		}
		if(flag == false) {
			System.out.println(" Duplicate Element not found");
		}  
		
	//Approach2: HashSet
		
	/*	String arr[] = {"java","c","c++","python","java"};
		
		HashSet <String>langs= new HashSet();
		
	/*	System.out.println(langs.add("Java"));
		System.out.println(langs.add("Java"));
		System.out.println(langs.add("Python")); */
		
	/*	boolean flag = false;
				
		for(String l:arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("found Duplicate Element:" +l);
			flag = true;
			}
			
		}
			if(flag==false)
			{
				System.out.println(" not found Duplicate Element");
				
			}*/
		
	}

}
