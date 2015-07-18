public class Main{
	public static void main(String[] args){
		Stack stack = new Stack(4);
		System.out.println(stack.isEmpty());
		stack.push(23);
		stack.push(33);
		stack.push(43);
		stack.push(53);
		
		System.out.println(stack.isFull());
		stack.pop();
		System.out.println(stack.isFull());
		System.out.println(stack.peek());
	}
}