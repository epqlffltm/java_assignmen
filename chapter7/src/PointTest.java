class Point2{
    int x;
    int y;

    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point2{
    int z;

    Point3D(){
        this(100,200,300);
    }
    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println(p1.x);
        System.out.println(p1.y);
        System.out.println(p1.z);
    }
}
