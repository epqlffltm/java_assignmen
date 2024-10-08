class NewUser {
    String userNumber; // 고객 번호
    String userName;   // 고객 이름
    String userAccount;// 계좌 번호
    int userMoney;     // 금액
    boolean userJoin;  // 가입 유무

    public NewUser(String userNumber, String userName, String userAccount, int userMoney, boolean userJoin) {
        this.userNumber = userNumber;
        this.userName = userName;
        this.userAccount = userAccount;
        this.userMoney = userMoney;
        this.userJoin = userJoin;
    }
}