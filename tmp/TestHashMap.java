import java.util.*;
public class TestHashMap{
	public static void main(String[] args){
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(4));
		hs.add(new R(3));
		hs.add(new R(2));
		System.out.println(hs);
		hs.add(new R(5));
		System.out.println(hs);
	}
}

class R{
	int count;
	public R(int count){
		this.count = count;
	}
	public String toString(){
		return "[" + count + "]";
	}
	public int hashCode(){
		return this.count;
	}
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj != null && obj.getClass() == R.class){
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
}