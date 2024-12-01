public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnlight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent(); // 수정된 부분
        car.run();
    }
}