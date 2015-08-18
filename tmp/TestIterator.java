import java.util.*;
class A{
	StringBuffer count;
	public A(StringBuffer count){
		this.count = count;
	}
	
}
public class TestIterator{
	public static void main(String[] args){
		ArrayList arraylist = new ArrayList();
		/* arraylist.add(new A("1"));
		arraylist.add(new A("2"));
		arraylist.add(new A("3"));
		arraylist.add(new A("4")); */
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		Iterator it = arraylist.iterator();
		StringBuffer sb = (StringBuffer)it.next();
		System.out.println(arraylist);
		sb.append("++++");
		System.out.println(arraylist);
	}
}