package java_project;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextInt();
		double m = sc.nextInt();
		
		double area=n*m;
		
		System.out.printf("%.f",area);
		
		sc.close();
	}

}
