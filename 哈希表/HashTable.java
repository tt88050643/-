import java.math.BigInteger;

public class HashTable{
	private Info[] arr;
	public HashTable(){
		arr = new Info[100];
	}
	
	public HashTable(int maxSize){
		arr = new Info[maxSize];
	}
	
	public void insert(Info info){
		int hashVal = hashCode(info.getIndex());
		while(arr[hashVal] != null && arr[hashVal].getName() != null){
			hashVal++;
			hashVal = hashVal % arr.length;
		}
		arr[hashVal] = info;
	}
	
	public Info find(String index){
		int hashVal = hashCode(index);
		while(arr[hashVal] != null){
			if(arr[hashVal].getIndex().equals(index)){
				return arr[hashVal];
			}
			hashVal++;
			hashVal = hashVal % arr.length;
		}
		return null;
	}
	
	public Info delete(String index){
		int hashVal = hashCode(index);
		while(arr[hashVal] != null){
			if(arr[hashVal].getIndex().equals(index)){
				arr[hashVal].setName(null);
				return arr[hashVal];
			}
			hashVal++;
			hashVal = hashVal % arr.length;
		}
		return null;
		
	}
	
	public int hashCode(String stringIndex){
		BigInteger hashVal = new BigInteger("0");
		BigInteger int27 = new BigInteger("1");
		for(int i=stringIndex.length()-1; i>=0; i--){
			int tmp = stringIndex.charAt(i) - 96;
			hashVal = (int27.multiply(new BigInteger(String.valueOf(tmp)))).add(hashVal);
			int27 = int27.multiply(new BigInteger(String.valueOf(27)));
		}
		return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue(); 
	}
}

class Info{
	private	String index;
	private String name;
	
	public Info(String index, String name){
		this.index = index;
		this.name = name;
	}
	public String getIndex(){
		return index;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}