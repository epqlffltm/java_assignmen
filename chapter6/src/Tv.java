public class Tv{
    String color;
    boolean power;
    int channel;

    //tv기능 mesode
    void power(){
        power=!power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}