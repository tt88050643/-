public class zhengze{
	public static void main(String[] args){
		String str = "hello, java!";
		System.out.println(str);
		System.out.println(str.replaceFirst("\\w+?", "+"));
	}
}