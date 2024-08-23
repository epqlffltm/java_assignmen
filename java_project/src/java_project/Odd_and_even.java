package java_project;

import java.util.Scanner;

public class Odd_and_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();
        
        // 홀짝 판별
        System.out.println((n % 2 == 1) ? "odd" : "even");
        
        sc.close();
    }
}
