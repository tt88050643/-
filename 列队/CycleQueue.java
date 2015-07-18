public class CycleQueue{
	private long[] arr;
	private int front;//对头
	private int end;//对尾
	private int arrIndex;//当前列队中元素个数
	
	public CycleQueue(){
		arr = new long[10];
		arrIndex = 0;
		front = 0;
		end = -1;
	}
	public CycleQueue(int maxsize){
		arr = new long[maxsize];
		arrIndex = 0;
		front = 0;
		end = -1;
	}
	//添加数据，从队尾插入
	public void insert(long value){
		if(end == arr.length-1) end = -1;
		arr[++end] = value;
		arrIndex++;
	}
	//删除数据，从对头删除
	public long remove(){
		long tmp = arr[front++];
		arrIndex--;
		if(front > end) front = 0;
		return tmp;
	}
	public boolean isEmpty(){
		return arrIndex == 0;
	}
	public boolean isFull(){
		return arrIndex == arr.length;
	}
	public long peek(){
		return arr[front];
	}
}