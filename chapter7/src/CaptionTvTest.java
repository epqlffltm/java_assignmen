public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv tv = new CaptionTv();
        tv.channel=10;
        tv.channelup();
        System.out.println(tv.channel);
        tv.displayCaption("Hello World");
        tv.caption=true;
        tv.displayCaption("Hello World");
    }
}
