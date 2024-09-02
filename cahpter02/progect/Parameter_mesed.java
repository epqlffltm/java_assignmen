package progect;

import java.util.Scanner;

class Parameter {
    int n;
    int[] ary;
    Scanner sc = new Scanner(System.in);

    Parameter(int n, int[] ary) {
        this.n = n;
        this.ary = ary;
    }

    int getSum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ary[i];
        }
        return sum;
    }

    int getMax() {
        int max = ary[0];
        for (int i = 1; i < n; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }
        }
        return max;
    }

    int getOver() {
        System.out.print("기준 값을 입력하세요: ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ary[i] > a) {
                count++;
            }
        }
        return count;
    }

    void getReverse() {
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.println();
    }
}

public class Parameter_mesed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열에 집어넣을 정수의 갯수를 입력해 주세요");
        int n = sc.nextInt();

        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("정수를 입력하세요: ");
            ary[i] = sc.nextInt();
        }

        Parameter param = new Parameter(n, ary);

        System.out.println("어떤 값을 출력하시겠습니까?");
        System.out.println("getSum: 1");
        System.out.println("getOver: 2");
        System.out.println("getMax: 3");
        System.out.println("getReverse: 4");

        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("합계: " + param.getSum());
                break;
            case 2:
                System.out.println("기준 값보다 큰 수의 개수: " + param.getOver());
                break;
            case 3:
                System.out.println("최대 값: " + param.getMax());
                break;
            case 4:
                System.out.print("역순: ");
                param.getReverse();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }

        sc.close();
    }
}

