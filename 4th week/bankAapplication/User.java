class User {
    public static NewUser userCreate(String userNumber, String userName, String userAccount, int userMoney, boolean userJoin) {
        return new NewUser(userNumber, userName, userAccount, userMoney, userJoin);
    }

    public static void userArray(NewUser us, NewUser[] accounat, int index) {
        accounat[index] = us;
    }

    public static void select(NewUser[] accounat, int size) {
        for (int i = 0; i < size; ++i) {
            if (accounat[i].userJoin) {
                System.out.println(accounat[i].userNumber + " | " + accounat[i].userName + " | " + accounat[i].userAccount + " | " + accounat[i].userMoney);
            }
        }
    }

    public static void deposit(NewUser u, int amount) {
        u.userMoney += amount;
    }

    public static void withdraw(NewUser u, int amount) {
        if (u.userMoney >= amount) {
            u.userMoney -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}