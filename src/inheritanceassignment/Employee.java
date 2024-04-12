package inheritanceassignment;

public class Employee {

	private String  empName;
	private double  empSalary;
	
	//Setter method
	 public void setEmpName(String newValue) {
		 empName = newValue;
	 }
	 
	 public void setEmpSalary(double newValue) {
		 empSalary = newValue;
	 }
	 
	 //getter method
	 public String getEmpName() {
		return empName;
	 }
	 
	 public double getEmpSalary() {
			return empSalary;
	 }
	 
	 void displayinfo() {
		 
	 System.out.println("Employee name is: +empName");
	 
	 System.out.println("Employee salary is: +empSalary");
}
}
