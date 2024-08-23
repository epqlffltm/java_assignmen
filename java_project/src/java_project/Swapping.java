package java_project;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println("n: "+n+"  m: "+m);
        
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        
        System.out.println("n: "+n+"  m: "+m);
        
        sc.close();
    }
}
