public class CycleQueue{
	private long[] arr;
	private int front;//��ͷ
	private int end;//��β
	private int arrIndex;//��ǰ�ж���Ԫ�ظ���
	
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
	//������ݣ��Ӷ�β����
	public void insert(long value){
		if(end == arr.length-1) end = -1;
		arr[++end] = value;
		arrIndex++;
	}
	//ɾ�����ݣ��Ӷ�ͷɾ��
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