public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        System.out.println("tv1의 채널"+tv1.channel);
        System.out.println("tv2의 채널은"+tv2.channel);

        tv1.channel = 7;
        tv2.channel = 3;

        System.out.println("tv1의 채널"+tv1.channel);
        System.out.println("tv2의 채널은"+tv2.channel);

        tv1.channel++;

        System.out.println("tv1의 채널"+tv1.channel);

        tv1=tv2;

        System.out.println("tv1의 채널"+tv1.channel);
    }
}