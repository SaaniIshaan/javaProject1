package finalPackage;

public class RomantoInteger {

	// this function returns value of a Roman Symbol
	int value(char c) {
		
		if(c == 'I')
		return 1;
		
		if(c == 'V')
		return 5;
	
		if(c == 'X')
		return 10;
		
		if(c == 'L')
		return 50;
		
		if(c == 'C')
		return 100;
		
		if(c == 'D')
		return 500;
		
		if(c == 'M')
		return 1000;
		
		return -1;
	}
	
	//find decimal value of a given Roman numeral
	
	int romanToDecimal(String str)
	{
		//initialize result
		int res = 0;
		
		for(int i = 0; i<str.length(); i++)
		{
		//  getting value of symbol s[i]
			
			int s1  = value(str.charAt(i));
			
			// getting value of symbol s[i+1]
			if(i+1<str.length()){
				int s2 = value(str.charAt(i+1));
				
				//comparing both values
				if(s1 >= s2){
				// value of current symbol is greater or equal to the next
				 
				res = res +s1;
				} else {
				res = res + s2 - s1;
				i++;//value of current symbol is 
				// less than the next symbol
				}
			} else {
				res = res + s1;
				i++;
			}
		}
		return res;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		RomantoInteger ob = new RomantoInteger();
		
		 String str = "MCMV";
		 
		 System.out.println("Integer form of Roman Numeral is: " +ob.romanToDecimal(str));
	}

}
