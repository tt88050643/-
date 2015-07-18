public class Stack{
	private long[] arr;
	private int top;
	
	public Stack(){
		arr = new long[10];
		top = -1;//ջ��
	}
	public Stack(int maxsize){
		arr = new long[maxsize];
		top = -1;
	}
	/*
	 *�������
	 */
	public void push(long value){
		arr[++top] = value;
	}
	/*
	 *��������
	 */
	public long pop(){
		return arr[--top];
	}
	/*
	 *�鿴����
	 */
	public long peek(){
		return arr[top];
	}
	/*
	 *�ж�ջ�Ƿ�Ϊ��
	 */
	public boolean isEmpty(){
		return top == -1;
	}
	/*
	 *�ж�ջ�Ƿ���
	 */
	public boolean isFull(){
		return top == arr.length-1;
	}
}