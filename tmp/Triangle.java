public class Triangle{
	public static void main(String[] args){
		System.out.println(new Triangle().f(6));
	}
	
	public int f(int n){
		if(n == 1) return 1;
		return n + f(n-1);
	}
}