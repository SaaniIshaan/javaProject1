package advance.java;

public class Stack {

	int[] stck = new int[5];
	int tos;
	
	public Stack() {
		tos = -1;
	}
	void push(int item) throws Exception {
		if(tos == 4) {
		//	System.out.println("Stack overflow....");
			throw new Exception("Stack overflow....");
		}
		else {
			stck[++tos] = item;
		}
	}
	 int pop()throws Exception {
		 if(tos< 0) {
			 System.out.println("Stack underflow....");
				 return 0;
			}
		 else {
			 return stck[tos--];
		 }
	 }
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Stack evenNumbers = new Stack();
		evenNumbers.push(2); //0
		evenNumbers.push(4); //1
		evenNumbers.push(6); //2
		evenNumbers.push(8); //3
		evenNumbers.push(10); //4
		//evenNumbers.push(12); 
		
		System.out.println(evenNumbers.pop()); //4
		System.out.println(evenNumbers.pop()); //3
		System.out.println(evenNumbers.pop()); //2
		System.out.println(evenNumbers.pop()); //1
		System.out.println(evenNumbers.pop()); //0
		System.out.println(evenNumbers.pop()); //-1
		
	}
}
	
	
	
	