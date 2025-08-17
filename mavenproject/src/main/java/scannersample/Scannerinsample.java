package scannersample;

import java.util.Scanner;

public class Scannerinsample {

	public static void main(String[] args) {
		System.out.println("Enter you name :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		String name=sc.next();
		int age=sc.nextInt();
		System.out.println("Name: " +name);
		System.out.println("Age:" +age);
	}

}
