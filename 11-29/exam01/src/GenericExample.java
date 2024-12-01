public class GenericExample {
    public static void main(String[] args) {
        Product<Tv,String>product1=new Product<>();
        product1.setKind(new Tv());
        product1.setModel("smartphone");

        Tv tv=product1.getKind();
        String Tvmodel=product1.getModel();

        Product<Car,String>product2=new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUB_Car");

        Car car=product2.getKind();
        String Carmodel2=product2.getModel();
    }
}
