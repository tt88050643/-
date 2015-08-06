public class Fob{
	public static void main(String[] args){
		System.out.println(new Fob().f(11));
	}
	
	public int f(int n){
		if(n == 1 || n == 2) return 1;
		return f(n-1) + f(n-2);
	}
}