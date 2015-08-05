public class Main{
	public static void main(String[] args){
		Tree bintree = new Tree();
		bintree.insert(5, "i am 10");
		bintree.insert(1, "i am 1");
		bintree.insert(11, "i am 11");
		bintree.insert(12, "i am 11");
		bintree.insert(9, "i am 11");
		bintree.insert(14, "i am 14");
		bintree.insert(0, "i am 14");
		bintree.insert(-1, "i am 14");
		bintree.insert(2, "i am 14");
		bintree.insert(22, "i am 14");
		bintree.insert(23, "i am 14");
		Tree bintree2 = new Tree();
		bintree2.insert(5, "i am 10");
		bintree2.insert(1, "i am 1");
		bintree2.insert(11, "i am 11");
		bintree2.insert(12, "i am 11");
		bintree2.insert(9, "i am 11");
		bintree2.insert(14, "i am 14");
		bintree2.insert(0, "i am 14");
		bintree2.insert(-1, "i am 14");
		bintree2.insert(2, "i am 14");
		//System.out.println(bintree.root.rightNode.rightNode.leftNode.sData);
		System.out.println("found: " + bintree.find(14).data);
		bintree.afterOrder(bintree.root);
		System.out.println("NodeNum: " + bintree.getNodeNum(bintree.root));
		System.out.println("Depth: " + bintree.getDepth(bintree.root));
		System.out.println("DepthOfKLevel: " + bintree.getDepthOfKLevel(bintree.root, 3));
		System.out.println("EndnodeNum: " + bintree.getEndnodeNum(bintree.root));
		System.out.println("structureSame?: " + bintree.structureCmp(bintree.root, bintree2.root));
		System.out.println("isAVL?: " + bintree.isAVL(bintree.root));
		System.out.println("mirror test:");
		bintree.afterOrder(bintree.root);
		System.out.println("before mirror:");
		bintree.mirror(bintree.root);
		bintree.afterOrder(bintree.root);
	}
}