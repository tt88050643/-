public class Person{
	public Person(){
		System.out.println("4");
	}
	int a = 0;
		{
		System.out.println("3 a------" + a);
	}
	{
		a = 6;
		if(a > 4){
			System.out.println("a------>" + a);
		}
		System.out.println("2");
	}	
	

	{
		System.out.println("3 a------" + a);
	}

	public static void main(String[] args){
		new Person();
	}
}