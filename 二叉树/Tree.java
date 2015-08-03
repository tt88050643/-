public class Tree{
	public Node root;
	public void insert(long value, String sValue){
		Node newNode = new Node(value, sValue);
		Node current = root;
		if(current == null){
			root = newNode;
			return;
		}else{
			while(current != null){
				Node parent = current;
				if(newNode.data <= current.data){
					current = parent.leftNode;
					if(current == null){
						parent.leftNode = newNode;
						return;
					}
				}else{
					current = current.rightNode;
					if(current == null){
						parent.rightNode = newNode;
						return;
					}
				}	
			}
		}
	}
	
	public Node find(long value){
		Node current = root;
		while(current != null){
			if(current.data == value){
				return current;
			}else if(value < current.data){
				current = current.leftNode;
			}else{
				current = current.rightNode;
			}	
		}
		return null;	
	}
	
	public void frontOrder(Node localNode) {
		if(localNode != null) {
			//访问根节点
			System.out.println(localNode.data + ", " + localNode.sData);
			//前序遍历左子树
			frontOrder(localNode.leftNode);
			//前序遍历右子树
			frontOrder(localNode.rightNode);
		}
	}
	
	public void inOrder(Node localNode) {
		if(localNode != null) {
			//前序遍历左子树
			inOrder(localNode.leftNode);
			//访问根节点
			System.out.println(localNode.data + ", " + localNode.sData);
			//前序遍历右子树
			inOrder(localNode.rightNode);
		}
	}
	
	public void afterOrder(Node localNode) {
		if(localNode != null) {
			//前序遍历左子树
			afterOrder(localNode.leftNode);
			//前序遍历右子树
			afterOrder(localNode.rightNode);
			//访问根节点
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}
	
	
}