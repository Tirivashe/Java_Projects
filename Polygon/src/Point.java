public class Point {
    double x = 0.0;
    double y = 0.0;

    private Point(){

    }

    public Point(int xPos, int yPos){
        this.x = xPos;
        this.y = yPos;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
}
