package queue;

public class Node {
	private Object obj;
	private Node prev;
	private Node next;
	
	public Node() {
		
	}
	public Node(Object obj) {
		this.obj=obj;
		this.prev=null;
		this.next=null;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
