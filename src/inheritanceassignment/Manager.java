package inheritanceassignment;

public class Manager extends Employee {
	
	String  empName;
	double  empSalary;
	int		empBonus;
	
/*	 public void setEmpName(String newValue) {
		 empName = newValue;
	 }
	 
	 public void setEmpSalary(double newValue) {
		 empSalary = newValue;
	 }
*/	 
	 public void setEmpBonus(int newValue) {
			empBonus = newValue;
	 }	
	 
	
	 //getter method
	 
/*	public String getEmpName() {
		return empName;
	 }
	 
	public double getEmpSalary() {
			return empSalary;
	}
*/	
	 public int getEmpBonus() {
		return  empBonus ;
		
		
	}
}
