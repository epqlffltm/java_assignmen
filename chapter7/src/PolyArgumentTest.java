public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b=new Buyer();

        b.buy(new Tv2());
        b.buy(new Computer());

        System.out.println(b.money);
        System.out.println(b.bonusPoint);

        System.out.println(b);//메모리 주소 출력
    }
}
