package listeSimple;

import listeSimple.NodeInt;

public class NodeInt {
	
	private int element;
	private NodeInt next;
	
	public NodeInt() {
		
	}
	
	public NodeInt(int e, NodeInt n) {
		element = e;
		next = n;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public NodeInt getNext() {
		return next;
	}

	public void setNext(NodeInt next) {
		this.next = next;
	}
	
	public String toStringRecurs() {
		return "[element=" + element + ",next=" + next.toString() + "]";
	}
	
	public String toString() {
		return "[element=" + element + "]";
	}
}