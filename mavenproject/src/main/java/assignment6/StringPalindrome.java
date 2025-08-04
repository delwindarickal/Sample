// Program to check whether the given Strings are Palindrome or not. • Java • Malayalam
package assignment6;

public class StringPalindrome {
	
	public  boolean palindrome(String s) {
		int l=s.length()-1;// length of the string-1
		int i=0;
		
		String t=s.toLowerCase();// converting to lower case for comparison
		while(i<l)
		{ 
			if(t.charAt(i)==t.charAt(l)) // i for checking from index 0 and l from end
			{ 
				return true;
		}
			i++;
			l--;
		}
		return false;
		}
	public void palindromedisplay(String s)
	{
		if(palindrome(s)==true) {
			System.out.println(s+" is a Palindrome ");
		}
		else {
			System.out.println(s+ " is not a Palindrome");
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome p=new StringPalindrome();
		p.palindromedisplay("Java");
		p.palindromedisplay("Malayalam");

	}

}
