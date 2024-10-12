public class Circle extends Shape{
    Point center;
    int radius;

    Circle(){
        this(new Point(0,0),100);
    }

    Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    void draw(){
        System.out.println(center.x+","+center.y+","+radius);
    }
}