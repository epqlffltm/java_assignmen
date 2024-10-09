import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("두 정수를 입력해 주세요: ");
            int n = sc.nextInt();
            int m = sc.nextInt();

            int add = Math.add(n, m);
            System.out.println("덧셈 결과: " + add);

            int sub = Math.sub(n, m);
            System.out.println("뺄셈 결과: " + sub);

            int mul = Math.mul(n, m);
            System.out.println("곱셈 결과: " + mul);

            double div = Math.div(n, m);
            System.out.println("나눗셈 결과: " + div);
        }
    }
}