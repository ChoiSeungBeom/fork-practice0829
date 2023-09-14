package bit701.day0914;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex8_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> set=new HashSet<String>();
		Set<String> set=new TreeSet<String>();//순서대로 나옴
		set.add("red");
		set.add("blue");
		set.add("red");
		set.add("green");
		set.add("green");
		set.add("red");
		set.add("blue");
		set.add("red");
		set.add("yellow");
		System.out.println(set.size());//중복된거 빼고 4개
		
		for(String s:set)
			System.out.println(s);
		
	}

}
