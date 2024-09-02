package progect;

import java.util.Scanner;

public class OrdEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        n = sc.nextInt();

        while (n != 0) {
            System.out.println(n % 2 == 1 ? "홀수" : "짝수");
            n = sc.nextInt();
        }

        sc.close();
    }
}