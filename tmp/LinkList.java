class Node{
	public long data;
	public Node next;
	
	public Node(long data){
		this.data = data;
	}
}

class LinkedList{
	public Node firstNode;
	public Node lastNode;
	public Node insert(long data){
		Node newNode = new Node(data);
		if(firstNode == null){
			firstNode = newNode;
			lastNode = newNode;
			return newNode;
		}
		lastNode.next = newNode;
		lastNode = lastNode.next;
		return lastNode;
	}
	
	public boolean deleteNode(long data){
		Node currentNode = firstNode;
		Node preCurrentNode = firstNode;
		if(firstNode.data == data){
			firstNode = firstNode.next;
		}
		while(currentNode != null){
			if(currentNode.data == data){
				break;
			}
			preCurrentNode = currentNode;
			currentNode = currentNode.next;	
		}
		if(currentNode == null) return false;
		else{
			preCurrentNode.next = currentNode.next;
			return true;
		}
		
	}
	
	public void traversalList(Node firstNode){
		Node currentNode = firstNode;
		while(currentNode != null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.println("****************************************************");
		
	}
}

public class LinkList{
	public static void main(String[] args){
		LinkedList linkedlist = new LinkedList();
		linkedlist.insert(10);
		linkedlist.insert(11);
		linkedlist.insert(12);
		linkedlist.traversalList(linkedlist.firstNode);
		linkedlist.deleteNode(10);
		linkedlist.traversalList(linkedlist.firstNode);
	}
}