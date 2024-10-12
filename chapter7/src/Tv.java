public class Tv{
    boolean power;//전원
    int channel;//채널

    void power(){
        power=!power;
    }
    void channelup(){
        channel++;
    }
    void channeldown(){
        channel--;
    }
}