public class CardTest {
    public static void main(String[] args) {
        System.out.println("height: "+Card.height);
        System.out.println("width: "+Card.width);

        System.out.println();

        Card c1 = new Card();
        c1.kind="heart";
        c1.number=7;

        Card c2=new Card();
        c2.kind="spade";
        c2.number=3;

        System.out.println("c1.width: "+c1.width);
        System.out.println("c1.height: "+c1.height);
        System.out.println("c1.kind: "+c1.kind);
        System.out.println("c1.number: "+c1.number);

        System.out.println();

        System.out.println("c2.width: "+c2.width);
        System.out.println("c2.height: "+c2.height);
        System.out.println("c2.kind:"+c2.kind);
        System.out.println("c2.number:"+c2.number);

        Card.height=100;
        Card.width=200;

        System.out.println("c1.width: "+c1.width);
        System.out.println("c1.height: "+c1.height);
        System.out.println("c1.kind: "+c1.kind);
        System.out.println("c1.number: "+c1.number);

        System.out.println();

        System.out.println("c2.width: "+c2.width);
        System.out.println("c2.height: "+c2.height);
        System.out.println("c2.kind:"+c2.kind);
        System.out.println("c2.number:"+c2.number);
    }
}

class Card{
    String kind;
    int number;
    static int width=140;
    static int height=270;
}