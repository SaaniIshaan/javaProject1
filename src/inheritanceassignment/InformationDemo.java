package inheritanceassignment;

public class InformationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager mn = new Manager();

		mn.setEmpName("John"); 
		mn.setEmpSalary(50000) ;
		mn.setEmpBonus(5000);
	
		System.out.println("Employee name is:" +mn.getEmpName());
		System.out.println("Employee salary is:" +mn.getEmpSalary());
		System.out.println("Employee bonus is:" +mn.getEmpBonus());
		
		
		Developer dv = new Developer(); 
		
		dv.setEmpName("Sam"); 
		dv.setEmpSalary(60000.00) ;
		dv.setEmpProgrammingLanguage ("Java");
		
		System.out.println("Employee name is:" +dv.getEmpName());
		System.out.println("Employee salary is:" +dv.getEmpSalary());
		System.out.println("Employee programmingLanguage  is:" +dv.getEmpProgrammingLanguage());
		
		
	}

}
