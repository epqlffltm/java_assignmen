package interfaceStudy;

class A{
    public void ma(B b){
        b.methodB();
    }
}
class B{
    public void methodB(){
        System.out.println("methodB()");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a=new A();
        a.ma(new B());
    }
}
