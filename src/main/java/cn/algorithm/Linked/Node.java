package cn.algorithm.Linked;
//链表元素
public class Node {
	public Node next;
	
	public int data;
	
	Node(int data){
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
