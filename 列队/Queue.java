public class Queue{
	private long[] arr;
	private int front;//��ͷ
	private int end;//��β
	private int arrIndex;//��ǰ�ж���Ԫ�ظ���
	
	public Queue(){
		arr = new long[10];
		arrIndex = 0;
		front = 0;
		end = -1;
	}
	public Queue(int maxsize){
		arr = new long[maxsize];
		arrIndex = 0;
		front = 0;
		end = -1;
	}
	//������ݣ��Ӷ�β����
	public void insert(long value){
		arr[++end] = value;
		arrIndex++;
	}
	//ɾ�����ݣ��Ӷ�ͷɾ��
	public long remove(){
		arrIndex--;
		return arr[front++];
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