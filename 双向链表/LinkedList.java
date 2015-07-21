public class LinkedList{
	public Node first;
	public Node last;
	public LinkedList(){
		first = null;
		last = null;
	}
	/*
	 *插入新节点，在头节点前插入，保持first为链表的第一个节点
	 */
	public void insertFirst(long value){
		Node node = new Node(value);
		if(isEmpty()){
			last = node;
		}else{
			first.previous = node;
		}
		node.next = first;
		first = node;
	}
	/*
	 *从尾结点插入node
	 */
	public void insertLast(long value){
		Node node = new Node(value);
		if(isEmpty()){
			first = node;
		}else{
			last.next = node;
			node.previous = last;
		}
		last = node;
	}
	 
	/*
	 *从头结点删除
	 */
	public Node deleteFirst(){
		Node tmpNode = first;
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null;
		}
		first = first.next;
		return tmpNode;
	}
	/*
	 *从尾结点删除
	 */
	 public Node deleteLast(){
		 Node tmpNode = last;
		 if(last.previous == null){
			 first = null;
			 last = null;
		 }else{
			 last = last.previous;
			 last.next = null;
			 tmpNode.previous = null;
		 }
		 return tmpNode;
		 
	 }
	/*
	 *显示节点
	 */
	public void display(){
		Node currentNode = first;
		for(;currentNode!=null;currentNode=currentNode.next){
			System.out.print(currentNode.data + " ");
		}
		System.out.println();
	}
	/*
	 *查找节点
	 */
	public Node find(long value){
		Node currentNode = first;
		for(;currentNode!=null;currentNode=currentNode.next){
			if(currentNode.data == value){
				break;
			}
		}
		return currentNode;
	}
	/*
	 *根据值来删除node
	 */
	public Node delete(long value){
		Node currentNode = first;
		if(currentNode == null){
			return currentNode;
		}
		if(value == currentNode.data){
			first = first.next;
			return currentNode;
		}
		for(;currentNode!=null;currentNode=currentNode.next){
			if(value == currentNode.data){
				break;
			}
		}
		
		currentNode.previous.next = currentNode.next;
		currentNode.next.previous = currentNode.previous;
		return currentNode;
		
	}
	
	/*
	 *判断链表是否为空
	 */
	 public boolean isEmpty(){
		 return (first == null);
	 }
}