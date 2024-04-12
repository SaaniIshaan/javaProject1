
public class MyGenericDynamicStack <E extends Object> {

	private int size;
	private E[] a;
	private int top;
	
	public MyGenericDynamicStack(int s) {
		this.size = s;
		a = (E[]) new Object[s];
		top = -1;
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return  top == -1;
	}
	
	public E peek() {
		return a[top];
	}
	
	public void push(E item) {
		if(this.isFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
			this.increaseStackCapacity();
		}
		
		{ a[++top] = item;
		System.out.println("item has been inserted");
		}
	}
	
	private void increaseStackCapacity() {
		
		Object[] newStack = new Object[this.size*2];
		for(int i = 0; i < size; i++) {
			newStack[i] = this.a[i];
		}
		this.a = (E[]) newStack;
		this.size = this.size*2;
	}
	
	public E pop() {
		E temp = null;
		if(isEmpty()) {
			System.out.println("no more element left in the stack");
		}
		else {
			temp = a[top--];
		}
		return temp;
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
		// TODO Auto-generated method stub
		
		MyGenericDynamicStack<String> ob = new MyGenericDynamicStack(2);
		ob.push("aana");
		ob.push("john");
		ob.display();
		ob.push("divya");
		ob.push("mansi");
		ob.display();
		
	}

}
