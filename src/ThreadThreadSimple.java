
public class ThreadThreadSimple extends Thread {

	public void run() { //running
		System.out.println("task started by thread: " +this.getName());
		System.out.println("task completed by: " +this.getName());
	}
	//terminated
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadThreadSimple t1 = new ThreadThreadSimple();  // new 
		t1.start();  //runnable
		
		ThreadThreadSimple t2 = new ThreadThreadSimple();  // new
		t2.start();  //runnable
		
	}

}
