public class Main{
	public static void main(String[] args){
		HashTable ht = new HashTable();
		ht.insert(new Info("a", "张三"));
		ht.insert(new Info("ct", "李四"));
		
		System.out.println(ht.find("a").getName());
		System.out.println(ht.find("ct").getName());
		
		
		System.out.println(ht.delete("ct"));
		System.out.println(ht.find("a").getName());
		System.out.println(ht.find("ct").getName());
	}
}