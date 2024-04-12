
public class MyQueue {

	public int size;
	public int []a;
	public int front;
	public int rear;
	public int currentSize;
	
	public MyQueue(int size) {
		
		this.size = size;
		a = new int[size];
		front = 0;
		rear = -1;
		currentSize = 0;
	}
	
	public boolean isEmpty() {
		if(currentSize == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(currentSize == size) {
			return  true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Can not insert");
		}
		else {
			rear++;
			a[rear] = item;
			currentSize++;
		}
	}
	
	public int dequeue() {
		int item = -1;
		if(isEmpty()) {
			System.out.println("Empty queue");
		}
		else {
			item = a[front];
			front++;
			currentSize--;
		}
		return item;
	}
	
	public void display() {
		System.out.println("content of the queue");
		for(int i = front; i<= rear; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(4);
			queue.enqueue(30);
			queue.enqueue(20);
			queue.enqueue(40);
			queue.enqueue(50);
			queue.display();
		//	queue.enqueue(60);
			
			int item = queue.dequeue();
			System.out.println("item deleted:" + item);
			queue.display();
			
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.display();
		//	queue.dequeue();
			
	}

}
