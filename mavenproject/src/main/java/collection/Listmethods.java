package collection;

import java.util.ArrayList;
import java.util.List;

public class Listmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("Apple");
		s.add("Orange");
		s.add("Grapes");
		s.add("Pineapple");
		System.out.println(s);
		System.out.println(s.get(0));
        System.out.println(s.get(2));
        s.set(3, "Strawberry");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.remove(1);
        System.out.println(s);
        System.out.println(s.contains("Orange"));
        System.out.println(s.contains("Apple"));
        System.out.println(s.indexOf("Grapes"));
        s.add("Apple");
        System.out.println(s);
        System.out.println(s.lastIndexOf("Apple"));
	}

}
