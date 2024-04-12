package Day8package;

public class ConvertIntoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1 Approach
		
		int a = 10;
		String b = Integer.toString(a);
		System.out.println("Using Integer.toString :"+b);
		System.out.println(b.length());
		System.out.println(b.charAt(0));
		
		// 2 approach
		
		String c = String.valueOf(a);
		System.out.println("Using String.valueOf :"+c);
		
		//approach 3
		
		String d = String.format("%d",a);
		System.out.println("Using String.format:"+d);
		
		
	}

}
