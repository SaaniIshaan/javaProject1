
public class MyStack {
	
	private int size;
	private int []a;
	private int top;
	
	public MyStack(int s) {
		size = s;
		a = new int[size];
		top = -1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peek() {
		return a[top];
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("can't insert the value");
		}
		else {
			top++;
			a[top] = item;
			System.out.println("item has been inserted");
		}
	}
	
	public int pop() {
		int deleted = -1;
		if(isEmpty()) {
			System.out.println("no more element left in the stack");
		}
		else {
			deleted = a[top];
			top--;
		}
		return deleted;
	}
	
	public void display() {
		System.out.println("content of stack:");
		int temp = top;
		while(temp > -1) {
			System.out.println(a[temp]);
			temp--;
		}
		
	}
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack(5);
		
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.push(5);
		ms.display();
	//	ms.push(6);
		
		
		ms.pop();
		System.out.println("after popping");
		ms.display();
		
		ms.pop();
		ms.pop();
		ms.pop();
		ms.pop();
		ms.display();
	}

}
