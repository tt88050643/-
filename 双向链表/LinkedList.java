public class LinkedList{
	public Node first;
	public Node last;
	public LinkedList(){
		first = null;
		last = null;
	}
	/*
	 *�����½ڵ㣬��ͷ�ڵ�ǰ���룬����firstΪ����ĵ�һ���ڵ�
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
	 *��β������node
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
	 *��ͷ���ɾ��
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
	 *��β���ɾ��
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
	 *��ʾ�ڵ�
	 */
	public void display(){
		Node currentNode = first;
		for(;currentNode!=null;currentNode=currentNode.next){
			System.out.print(currentNode.data + " ");
		}
		System.out.println();
	}
	/*
	 *���ҽڵ�
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
	 *����ֵ��ɾ��node
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
	 *�ж������Ƿ�Ϊ��
	 */
	 public boolean isEmpty(){
		 return (first == null);
	 }
}