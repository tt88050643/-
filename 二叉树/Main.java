public class Main{
	public static void main(String[] args){
		Tree bintree = new Tree();
		bintree.insert(10, "i am 10");
		bintree.insert(1, "i am 1");
		bintree.insert(11, "i am 11");
		bintree.insert(12, "i am 12");
		bintree.insert(14, "i am 14");
		//System.out.println(bintree.root.rightNode.rightNode.leftNode.sData);
		System.out.println(bintree.find(14).data);
		bintree.afterOrder(bintree.root);
		
	}
}