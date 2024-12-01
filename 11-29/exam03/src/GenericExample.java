public class GenericExample {
    public static void main(String[] args) {
        Box<String>box1=new Box<>();
        box1.content="100";

        Box<String>box2=new Box<>();
        box2.content="100";//100이 아닌 다른 수로 하면 false출력

        boolean result1 = box1.compare(box2);
        System.out.println(result1);
    }
}
