package inheritanceassignment;

public class Developer extends Employee {
	
	String  empName;
	double  empSalary;
	String  empProgrammingLanguage;
	
	public void setEmpName(String newValue) {
		 empName = newValue;
	 }
	 
	public void setEmpSalary(double newValue) {
		 empSalary = newValue;
	}
	
	public void setEmpProgrammingLanguage(String newValue) {
		
		empProgrammingLanguage = newValue;
	}
	 
	 
	public String getEmpName() {
		return empName;
	}
		 
	public double getEmpSalary() {
		return empSalary;
	}
	 
	public String getEmpProgrammingLanguage() {
		
		return  empProgrammingLanguage;

	}


	

}
