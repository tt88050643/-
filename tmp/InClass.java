public class InClass{
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticinnerClass{
		private static int age = 10;
		public static void access(){
			System.out.println(age);
		}
	}
	
	public static void main(String[] args){
		
		InClass.StaticinnerClass.access();
	}
}