package progect;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
	}

}
