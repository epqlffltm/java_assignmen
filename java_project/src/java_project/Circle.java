package java_project;

import java.lang.Math;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("반지름을 입력하세요: ");
        int n = sc.nextInt();
        
        // 원의 둘레 계산
        System.out.println("원의 둘레: " + Math.PI * n * 2);
        // 원의 넓이 계산
        System.out.println("원의 넓이: " + Math.PI * n * n);
        
        sc.close();
    }
}
