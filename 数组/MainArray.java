public class MainArray{
	public static void main(String[] args){
		TestOrderArray arr = new TestOrderArray();
		arr.insert(13);
		arr.insert(16);
		arr.insert(15);
		arr.insert(14);
		//System.out.println(arr.search(16));
		//System.out.println(arr.get(2));
		//arr.change(0, 99);
		arr.display();
		System.out.println(arr.binarySearch(99));
	}
}