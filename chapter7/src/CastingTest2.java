public class CastingTest2 {
    public static void main(String[] args) {
        Car car=new Car();
        Car car2=null;
        Engine en=null;

        car.drive();
        en=(Engine)car;//허용 안됨
        en.drive();
        car2=en;
        car2.drive();
    }
}
