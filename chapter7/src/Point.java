public class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }
    String getXy(){
        return "("+x+","+y+")v";
    }
}