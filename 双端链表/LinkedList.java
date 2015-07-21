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
		}
		last = node;
	}
	 
	/*
	 *ɾ��һ���ڵ㣬��ͷ�ڵ�
	 */
	public Node deleteFirst(){
		Node tmpNode = first;
		if(first.next == null){
			last = null;
		}
		first = first.next;
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
		Node previous = first;
		if(value == currentNode.data){
			first = first.next;
			return currentNode;
		}
		for(;currentNode!=null;previous = currentNode, currentNode=currentNode.next){
			if(value == currentNode.data){
				break;
			}
		}
		
		previous.next = currentNode.next;
		return currentNode;
		
	}
	
	/*
	 *�ж������Ƿ�Ϊ��
	 */
	 public boolean isEmpty(){
		 return (first == null);
	 }
}