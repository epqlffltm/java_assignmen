public class GenericExample {
    public static<T> Box<T>boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intval1 = box1.get();
        System.out.println(intval1);

        Box<String>box2=boxing("hellow");
        String stringval2 = box2.get();
        System.out.println(stringval2);
    }
}