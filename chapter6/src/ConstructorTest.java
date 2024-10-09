public class ConstructorTest {
    public static void main(String[] args) {
        int n=5;

        Constructor1 test1 = new Constructor1();
        Constructor2 test2 = new Constructor2(n);

        System.out.println(test1);//메모리 값 출력
        System.out.println(test2);//메모리값 출력
    }
}
 class Constructor1 {
    int value=5;
    int value2=10;
 }

 class Constructor2 {
    int value;
    int value2;
    Constructor2(int value) {
        this.value = value;
        value2=10;
    }
 }