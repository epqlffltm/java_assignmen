public class ThreadNameExample {
    public static void main(String[] args) {
        // 메인 스레드를 가져와서 이름을 출력
        Thread mainThread = Thread.currentThread();
        System.out.println("메인 스레드 이름: " + mainThread.getName());

        // 이름이 없는 세 개의 스레드 생성 및 시작
        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    System.out.println("스레드 이름: " + getName());
                }
            };
            threadA.start(); // 새로 생성된 스레드 시작
        }

        // 이름이 있는 스레드 생성 및 시작
        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println("스레드 이름: " + getName());
            }
        };
        chatThread.setName("chat-thread"); // 스레드 이름 설정
        chatThread.start(); // chat-thread 시작
    }
}
