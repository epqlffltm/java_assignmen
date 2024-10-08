import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, money, index = 0;
        String name, number;

        NewUser[] accounat = new NewUser[100];

        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------------------------");

            n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.print("고객 이름: ");
                    name = scanner.next();
                    System.out.print("계좌 번호: ");
                    number = scanner.next();
                    System.out.print("입금 금액: ");
                    money = scanner.nextInt();

                    NewUser us = User.userCreate(String.valueOf(index + 1), name, number, money, true);
                    User.userArray(us, accounat, index);

                    ++index;
                    break;

                case 2:
                    User.select(accounat, index);
                    break;

                case 3:
                    System.out.print("예금할 사용자 번호: ");
                    number = scanner.next();
                    System.out.print("금액: ");
                    money = scanner.nextInt();

                    for (int i = 0; i < index; ++i) {
                        if (accounat[i].userNumber.equals(number)) {
                            User.deposit(accounat[i], money);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("출금할 사용자 번호: ");
                    number = scanner.next();
                    System.out.print("금액: ");
                    money = scanner.nextInt();

                    for (int i = 0; i < index; ++i) {
                        if (accounat[i].userNumber.equals(number)) {
                            User.withdraw(accounat[i], money);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("시스템을 종료합니다");
                    scanner.close();
                    return;

                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
                    continue;
            }
        }
    }
}