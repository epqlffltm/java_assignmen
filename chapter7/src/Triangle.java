public class Triangle extends Shape{
    Point [] p=new Point[3];

    Triangle(Point [] p){
        this.p=p;
    }
    void draw(){
        System.out.printf("p1=%s, p2=%s, p3=%s, color=%s %n",p[0].getXy(),p[1].getXy(),p[2].getXy(),color);
    }
}