public class Main{
	public static void main(String[] args){
		System.out.println(triangle(500));
	}
	
	public static int triangle(int n){
		if(n == 1) return 1;
		else{
			return n + triangle(n-1);
		}
	}
}