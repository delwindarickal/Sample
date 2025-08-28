package sample;

import java.util.ArrayList;

import java.util.List;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c = new ArrayList<String>();
        c.add("Dog");
        c.add("Cat");
        c.add("Elephant");
        c.add("Fish");
        c.add("Tiger");
        for(String s:c)
        {
        	System.out.println(s);
        }
    } 

}
