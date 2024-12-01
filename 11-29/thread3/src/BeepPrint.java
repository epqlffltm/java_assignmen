public class BeepPrint {
    public static void main(String[] args) {
        Thread thread = new Thread(new BeepPrintExample());
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            thread.join(); // 메인 스레드가 비프음을 울리는 스레드가 종료될 때까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
