public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d=new Data();
        d.x=10;
        System.out.println("main(): "+d.x);

        change(d.x);
        System.out.println("after main(): "+d.x);
    }
    static void change(int x){
        x=1000;
        System.out.println("change(): "+x);
    }
}