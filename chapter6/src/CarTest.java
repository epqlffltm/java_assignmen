public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.gear="auto";
        car.door=4;

        Car car2 = new Car("while","auto",4);

        System.out.println(car.color+" "+car.gear+" "+car.door);
        System.out.println(car2.color+" "+car2.gear+" "+car2.door);
    }
}
