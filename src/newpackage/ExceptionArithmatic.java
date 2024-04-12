package newpackage;

public class ExceptionArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 0;

		 try {
			System.out.println(a/b);
			
		 } catch(Exception e) { 
		
			System.out.println("Divided by zero operation cannot possible");
			e.printStackTrace();
		}
		
	

}
}