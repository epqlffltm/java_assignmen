public class Car{
    String color;
    int door;

    void drive(){
        System.out.println("Car driving");
    }
    void stop(){
        System.out.println("Car stop");
    }
}

class Engine extends Car{
    void run(){
        System.out.println("Engine run");
    }
}