import java.util.Comparator;  
import java.util.List;  
import java.util.ArrayList;  
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		List<User> usrlist = new ArrayList<User>();
		usrlist.add(new User("dd", 4));
		usrlist.add(new User("aa", 1));
		usrlist.add(new User("ee", 5));
		usrlist.add(new User("ff", 2));
		usrlist.add(new User("cc", 3));
		ComparatorUser comparator = new ComparatorUser(); 
		Collections.sort(usrlist, comparator);
		for(User eachuser : usrlist){
			System.out.println(eachuser.getName());
		}
	}
}

class ComparatorUser implements Comparator{
	public int compare(Object arg0, Object arg1){
		User user0 = (User)arg0;
		User user1 = (User)arg1;
		return user0.getAge() - user1.getAge();
	}
}

class User{
	String name;
	int age;
	
	public User(String name, int age){
		this.name = name;
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}

