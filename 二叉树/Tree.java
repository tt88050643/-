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
	//前序遍历
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
	//中序遍历
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
	//后序遍历
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
	//计算二叉树中所有节点的个数
	public int getNodeNum(Node root){
		if(root == null){
			return 0;
		}
		return getNodeNum(root.leftNode) + getNodeNum(root.rightNode) + 1;
	}
	//计算二叉树的深度
	public int getDepth(Node root){
		if(root == null){
			return 0;
		}
		int leftDepth = getDepth(root.leftNode);
		int rightDepth = getDepth(root.rightNode);
		return leftDepth > rightDepth ? (leftDepth+1) : (rightDepth+1); 
	}
	//计算二叉树第K层的节点个数
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
	//计算二叉树的叶子节点个数
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
	//判断两颗二叉树结构是否相同
	public boolean structureCmp(Node root1, Node root2){
		if(root1 == null && root2 == null){
			return true;
		}else if(root1 == null || root2 == null){
			return false;
		}
		return structureCmp(root1.leftNode, root2.leftNode) && structureCmp(root1.rightNode, root2.rightNode);
	}
	//判断二叉树是否为平衡二叉树
	//如果二叉树不为空，如果左子树和右子树都是AVL树并且左子树和右子树高度相差不大于1，返回真，其他返回假
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
	//求二叉树的镜像
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