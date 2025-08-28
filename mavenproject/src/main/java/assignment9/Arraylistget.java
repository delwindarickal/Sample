package assignment9;

import java.util.ArrayList;


public class Arraylistget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Yellow");
        c.add("Green");
        c.add("Blue");
        c.add("Black");
        System.out.println("Colors in the list: " + c);
		
		System.out.println("The element at position 2 is :" +c.get(1));
	}

}
