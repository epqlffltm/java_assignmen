import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 10; i++) {
                    toolkit.beep();
                    try{Thread.sleep(100);}catch(InterruptedException e){}
                }
            }
        });
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("beep");
            try{Thread.sleep(100);}catch(InterruptedException e){}//작업 thread로 작동
             }
    }
}
//앞선것과 다르게 따로 실행되기에 동시에 작동함