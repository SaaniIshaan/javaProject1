package Day2package;

public class Student {
    int  roll_no;
    String name;         // instance variables
    String address;
    String phonenumber;
    
    Student(int _roll_no, String _name){
    	
    roll_no = _roll_no;      
    name = _name;        //Local variables
    }
    void display() {
	System.out.println(roll_no + "" + name + "" +phonenumber+ " " +address); 
    }
    public static void main(String[]arg) {
    	Student s1 = new Student(2, "John");
        Student s2 = new Student(3, "Sam");
        s1.address = "3649,Garnet st";
        s1.phonenumber = "310 543 4567";
        s2.address = "3524, Amie ave";
        s2.phonenumber ="424 765 986";
        s1.display();
        s2.display();
    }
  }
	


    		


