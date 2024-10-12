public class CastingTest1 {
    public static void main(String[] args) {
        Car car=null;
        Engine fe=new Engine();
        Engine fe1=new Engine();

        fe.run();
        car=fe;
        fe1=(Engine)car;
        fe1.run();
    }
}


