package assignment9;

import java.util.ArrayList;
import java.util.Iterator;


public class Arreayiterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Yellow");
        c.add("Green");
        c.add("Blue");
        c.add("Black");
        Iterator<String> i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    } 
}