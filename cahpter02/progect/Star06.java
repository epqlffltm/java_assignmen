package progect;

import java.util.Scanner;

public class Star06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = num; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}