package queue;

public class LinkedQueue {
	private Node head=new Node();
	private Node front;
	private Node rear;
	private int size;
	
	public LinkedQueue() {
		this.size=0;
		this.front=null;
		this.rear=null;
	}
	
	
	public Boolean isEmpty() {
		return (front==null);
		
	}
	
	
	public void add(Object item) {
		Node newNode = new Node(item);
		
		if(isEmpty()) {
			rear=newNode;
			front=newNode;
			head.setNext(newNode);
			head.setPrev(newNode);
			newNode.setNext(head);
			newNode.setPrev(head);
			
		}else {
			newNode.setPrev(head.getPrev());
			newNode.setNext(head);
			head.getPrev().setNext(newNode);
			head.setPrev(newNode);
		}
		size++;
	}
	
	
	
	//맨 앞에 있는 노드(front)를 꺼내줌
	public Object peek() {
		if(isEmpty()) {
			throw new IllegalStateException("the queue is empty");
		}else {
			return front.getObj();
		}
		
	}
	
	public Object remove() {
		Object item=peek();
		
		head.setNext(front.getNext());
		head.getNext().setPrev(head);
		front=front.getNext();
		size--;
		if(front==null) {
			rear=null;
		}
		return item;
		
	}
	
	// 노드를 움직이면서 노드에 있는 데이터를 반환해줌
			public Object checkNode() {
				String content = "";
				Node searchNode = this.head.getNext();
				for(int i=0;i<size;i++) {
					content += searchNode.getObj();
					content += " ";
					searchNode = searchNode.getNext();
				}
				return content;
			}
			
	public int size() {
		return size;
		
	}
	
	public Node getFront() {
		return this.front;
		
	}
	public Node getRear() {
		return this.rear;
		
	}
	public Node getHead() {
		return this.head;
	}
	

}
