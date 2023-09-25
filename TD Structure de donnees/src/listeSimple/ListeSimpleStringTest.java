package listeSimple;

public class ListeSimpleString {
	private NodeString head;
	
	public ListeSimpleString() {
		
	}
	
	public ListeSimpleString(NodeString head) {
		this.head = new NodeString(element, null);
	}
	
	public void insererElementEnTete(String elem) {
		NodeString newNode = new NodeString(elem, head);
		head = newNode;
		size++;
	}
	
	public String getElementTete() {
		return head.getElement();
	}
	
	public String getAvantDernierElement() {
		NodeString courant = head;
		//si le noeud de tête n'a pas de suivant alors la liste ne contient
		//qu'un seule élément. Il n'y a pas d'avant-dernier possible puisque le
		//premier est le même que le dernier
		if (courant.getNext() == null) {
			return null;
		}
		while(courant.getNext()!=null) {
			courant = courant.getNext();
		}
	}
	
	
}
