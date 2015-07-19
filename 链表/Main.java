public class Main{
	public static void main(String[] args){
		LinkedList linkedlist = new LinkedList();
		linkedlist.insertFirst(11);
		linkedlist.insertFirst(22);
		linkedlist.insertFirst(33);
		linkedlist.display();
		linkedlist.delete(11);
		linkedlist.display();
		//linkedlist.deleteFirst();
		//linkedlist.display();
		//System.out.println(linkedlist.find(10)==null? "not found!":linkedlist.find(10).data);
	}
}