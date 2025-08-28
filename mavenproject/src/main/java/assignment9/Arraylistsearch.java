package assignment9;

import java.util.ArrayList;

public class Arraylistsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Yellow");
        c.add("Green");
        c.add("Blue");
        c.add("Black");
        String s="Black";
        int i = c.indexOf(s);
        if(c.contains(s)) {
        	System.out.println(s + " is found in the list at position "+(i+1));
        }
        else {
        	System.out.println(s + " is not found in the list ");	
        }

	}

}
