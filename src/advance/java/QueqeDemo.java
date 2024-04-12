package advance.java;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueqeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(2);
		pq.add(3);
		
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		ArrayDeque<String>dq = new ArrayDeque<>();
		
		dq.add("one");
		dq.add("two");
		dq.add("three");
		dq.add("four");
		dq.addFirst("Hundred");
		dq.addLast("Zero");
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		
		Map<String,String> student = new HashMap<>();
		
		student.put("1B","Renuka");
		student.put("1C","Renuka");
		student.put("1D","Renuka");
		student.put(null,"Renuka");
		
		System.out.println(student.keySet());
		student.remove("1B");
		System.out.println(student.entrySet());
		student.clear();
		throw new Exception();
		
	}
}