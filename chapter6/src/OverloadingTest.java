public class OverloadingTest {
    public static void main(String[] args) {
        Overload ol = new Overload();

        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(1, 2, 3));
        System.out.println(ol.add(1, 2, 3, 4));
        ol.add(1, 'c');
        ol.add('a', 'b');
        ol.add("hallow");
    }
}