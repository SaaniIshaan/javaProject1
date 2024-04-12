package encapsulation;

class EncapsTest {
		private String empName;
		private int empAge;
		private int aadhar;
		
	// setter methods
		
		public void setEmpName(String newValue){
			empName = newValue;
		}
		
		public void setEmpAge(int newValue){
			empAge = newValue;
		}
		
		public void setEmpAadhar(int newValue){
			aadhar = newValue;
		}
		
	// Getter methods
		
		public String getEmpName()
		{
			return empName;
		}
		
		public int getEmpAge()
		{
			return empAge;
		}
		
		public int getEmpAadhar()
		{
			return aadhar;
		}
		
}	
					
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsTest cap = new EncapsTest();
		
		cap.setEmpName("monika");
		cap.setEmpAge(40);
		cap.setEmpAadhar(1234);
		
		System.out.println("Employee name is : " +cap.getEmpName());
		System.out.println("Employee Age is : " +cap.getEmpAge());
		System.out.println("Employee Aadhar is : " +cap.getEmpAadhar());

	}

}
