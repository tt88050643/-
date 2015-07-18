public class Stack{
	private long[] arr;
	private int top;
	
	public Stack(){
		arr = new long[10];
		top = -1;//栈顶
	}
	public Stack(int maxsize){
		arr = new long[maxsize];
		top = -1;
	}
	/*
	 *添加数据
	 */
	public void push(long value){
		arr[++top] = value;
	}
	/*
	 *弹出数据
	 */
	public long pop(){
		return arr[--top];
	}
	/*
	 *查看数据
	 */
	public long peek(){
		return arr[top];
	}
	/*
	 *判断栈是否为空
	 */
	public boolean isEmpty(){
		return top == -1;
	}
	/*
	 *判断栈是否满
	 */
	public boolean isFull(){
		return top == arr.length-1;
	}
}