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
	//ǰ�����
	public void frontOrder(Node localNode) {
		if(localNode != null) {
			//���ʸ��ڵ�
			System.out.println(localNode.data + ", " + localNode.sData);
			//ǰ�����������
			frontOrder(localNode.leftNode);
			//ǰ�����������
			frontOrder(localNode.rightNode);
		}
	}
	//�������
	public void inOrder(Node localNode) {
		if(localNode != null) {
			//ǰ�����������
			inOrder(localNode.leftNode);
			//���ʸ��ڵ�
			System.out.println(localNode.data + ", " + localNode.sData);
			//ǰ�����������
			inOrder(localNode.rightNode);
		}
	}
	//�������
	public void afterOrder(Node localNode) {
		if(localNode != null) {
			//ǰ�����������
			afterOrder(localNode.leftNode);
			//ǰ�����������
			afterOrder(localNode.rightNode);
			//���ʸ��ڵ�
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}
	//��������������нڵ�ĸ���
	public int getNodeNum(Node root){
		if(root == null){
			return 0;
		}
		return getNodeNum(root.leftNode) + getNodeNum(root.rightNode) + 1;
	}
	//��������������
	public int getDepth(Node root){
		if(root == null){
			return 0;
		}
		int leftDepth = getDepth(root.leftNode);
		int rightDepth = getDepth(root.rightNode);
		return leftDepth > rightDepth ? (leftDepth+1) : (rightDepth+1); 
	}
	//�����������K��Ľڵ����
	public int getDepthOfKLevel(Node root, int k){
		if(root == null || k == 0){
			return 0;
		}else if(k == 1){
			return 1;
		}
		int leftDepth = getDepthOfKLevel(root.leftNode, k-1);
		int rightDepth = getDepthOfKLevel(root.rightNode, k-1);
		return leftDepth + rightDepth;
	}
	//�����������Ҷ�ӽڵ����
	public int getEndnodeNum(Node root){
		if(root == null){
			return 0;
		}else if(root.leftNode == null && root.rightNode == null){
			return 1;
		}
		int leftEndnodeNum = getEndnodeNum(root.leftNode);
		int rightEndnodeNum = getEndnodeNum(root.rightNode);
		return leftEndnodeNum + rightEndnodeNum;
	}
	//�ж����Ŷ������ṹ�Ƿ���ͬ
	public boolean structureCmp(Node root1, Node root2){
		if(root1 == null && root2 == null){
			return true;
		}else if(root1 == null || root2 == null){
			return false;
		}
		return structureCmp(root1.leftNode, root2.leftNode) && structureCmp(root1.rightNode, root2.rightNode);
	}
	//�ж϶������Ƿ�Ϊƽ�������
	//�����������Ϊ�գ����������������������AVL���������������������߶�������1�������棬�������ؼ�
	public boolean isAVL(Node root){
		if(root == null){
			return true;
		}
		int leftDepth = getDepth(root.leftNode);
		int rightDepth = getDepth(root.rightNode);
		if(Math.abs(leftDepth - rightDepth) > 1){
			return false;
		}
		return isAVL(root.leftNode) && isAVL(root.rightNode);
	}
	//��������ľ���
	public void mirror(Node root){
		if(root == null){
			return;
		}
		Node tmpNode = root.leftNode;
		root.leftNode = root.rightNode;
		root.rightNode = tmpNode;
		if(root.leftNode != null){
			mirror(root.leftNode);
		}
		if(root.rightNode != null){
			mirror(root.rightNode);
		}
	}
}