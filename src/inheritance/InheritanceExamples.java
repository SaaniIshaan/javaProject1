package inheritance;

class Teacher{
	private String designation;
	private String university;
	
	 protected void setDesignation(String _designation) {
		 designation = _designation;
	 }
	 protected void setUniversity(String _university) {
		 university = _university;
	 }
		 protected String getDesignation() {
		 	return designation;
		 }
		 protected String getUniversity() {
			 return university;
		 }
		 	
		 void does() {
			 System.out.println("Teaching");
			 System.out.println("Valuation");
			 
		 }
}	 
		class ProgrammingTeacher extends Teacher{
			
		}
		 

		public class InheritanceExamples {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ProgrammingTeacher pta = new ProgrammingTeacher();
			
			pta.setDesignation("HOD");
			pta.setUniversity("TekArch");
			
			System.out.println(pta.getDesignation());
			System.out.println(pta.getUniversity());
			
			pta.does();
			
	}

}
