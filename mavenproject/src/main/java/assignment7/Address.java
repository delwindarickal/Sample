package assignment7;
//prgm class 2
public class Address {
String address;
Student s;

public Address(String address,Student s) {
	this.address=address;
	this.s=s;
}
public void display() {
	
	System.out.println("Name: "+s.name);
	System.out.println("Roll No.: "+s.rollno);
	System.out.println("Address:"+address);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Student n=new Student("Delwin",27);
Address a=new Address("Arickal House",n);
a.display();
	}

}
