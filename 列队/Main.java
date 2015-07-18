public class Main{
	public static void main(String[] args){
		CycleQueue queue = new CycleQueue(3);
		System.out.println(queue.isEmpty());
		queue.insert(23);
		queue.insert(33);
		queue.insert(43);
		queue.insert(53);
		//System.out.println("当前对头：" + queue.peek());
		//System.out.println("删除 " + queue.remove());
		//System.out.println("删除 " + queue.remove());
		//System.out.println("删除 " + queue.remove());
		//queue.insert(99);
		System.out.println("当前对头：" + queue.peek());
		System.out.println("当前对头：" + queue.peek());
		System.out.println("删除 " + queue.remove());
	}
}