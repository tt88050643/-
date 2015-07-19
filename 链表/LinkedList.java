public class LinkedList{
	public Node first;
	
	/*
	 *�����½ڵ㣬��ͷ�ڵ�ǰ���룬����firstΪ����ĵ�һ���ڵ�
	 */
	public void insertFirst(long value){
		Node node = new Node(value);
		node.next = first;
		first = node;
		
	}
	/*
	 *ɾ��һ���ڵ㣬��ͷ�ڵ�
	 */
	public Node deleteFirst(){
		Node tmpNode = first;
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
}