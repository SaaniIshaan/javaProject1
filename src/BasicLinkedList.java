
public class BasicLinkedList {

	public MNode head = null;
	
	public void addFront(int element) {
		
		MNode nd = new MNode(element);
		System.out.println("Adding:" + element);
		if(head == null) {
			head = nd;
		} else {
			nd.link = head;
			head = nd;
		}
	}
	
	public void deleteFront() {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("element deleted is =" + head.value);
			head = head.link;
		}
	}
	
	public void traverse() {
		System.out.println("list contents....................");
		MNode tmp = head;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.link;
		}
		System.out.println("....................");
	}
	
	
	public static void main(String[] args) {
		BasicLinkedList s1 = new BasicLinkedList();
		s1.addFront(3);
		s1.addFront(32);
		s1.addFront(54);
		s1.addFront(89);
		s1.addFront(76);
		
		s1.traverse();
		
		s1.deleteFront();
		s1.traverse();
		s1.addFront(100);
		s1.traverse();
	}

}
