public class Overload {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    void add(int a, char b) {
        System.out.println(a + b);
    }
    void add(char a, char b) {
        System.out.println(a + b);
    }
    void add(String str) {
        System.out.println(str + str);
    }
}
