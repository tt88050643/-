public class Main{
	public static void main(String[] args){
		CycleQueue queue = new CycleQueue(3);
		System.out.println(queue.isEmpty());
		queue.insert(23);
		queue.insert(33);
		queue.insert(43);
		queue.insert(53);
		//System.out.println("��ǰ��ͷ��" + queue.peek());
		//System.out.println("ɾ�� " + queue.remove());
		//System.out.println("ɾ�� " + queue.remove());
		//System.out.println("ɾ�� " + queue.remove());
		//queue.insert(99);
		System.out.println("��ǰ��ͷ��" + queue.peek());
		System.out.println("��ǰ��ͷ��" + queue.peek());
		System.out.println("ɾ�� " + queue.remove());
	}
}