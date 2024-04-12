package Day8package;

import java.text.DecimalFormat;

public class ConvertStringToIntegerExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1234";
		int number = Integer.parseInt(str);
		System.out.println("Convert using Integer.parseInt()  "+number);
		
		int number2 =Integer.valueOf(str);
		System.out.println("Convert using Integer.valueOf()  "+number2);
		
		int number3 = new Integer(str).intValue();
		System.out.println("Convert using new Integer()  "+number3);
		
	/* 	DecimalFormat decimalFormat = new DecimalFormat("#");
		
		try {
			int number4 =decimalFormat.parse(str).intValue();
			System.out.println("Convert using DecimalFormat  "+number4);
			
		} catch (ParseException e) {
		e.printStackTrace();
		}*/
		
		
		
		
	}

}
