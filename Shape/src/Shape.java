public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
    public abstract String color();
    public abstract void move(double x, double y);
    public abstract String getColor();

}

class Box extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private String color;
    private double length;
    private double width;

    public Box(String color, double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.color = color;
    }

    public double getTop(){
        return this.b;
    }
    public double getRight(){
        return this.c;
    }
    public double getBottom(){
        return this.d;
    }
    public void setTop(double a){
        this.a = a;
    }
    public void setRight(double a){
        this.c = a;
    }
    public void setBottom(double a){
        this.d = a;
    }

    public void setLeft(double a){
        this.b = a;
    }

    public double perimeter(){
        double length = getRight() - getLeft();
        double width = getTop() - getBottom();
        return 2*length*width;
    }

    public String color(){
        return this.color;
    }

    public String setColor(String newColor){
        String colour = newColor;
        return colour;
    }

    @Override
    public void move(double x, double y){
        double newX = this.a += x;
        double newY = this.b += y;
    }

    public String getColor(){
        return this.color;
    }

    public void render(){
        System.out.print("Box("+ getColor() + ","+getLeft()+ "," + getTop() + "," +getRight()  + "," + getBottom()+ ")");
    }

    public double getLeft(){
        return this.a;
    }


    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    @Override
    public double area(){
        return ((getRight()-getLeft())*(getTop() - getRight()));
    }

}

class Circle extends Shape {

    private double cx;
    private double cy;
    private double r;
    public int area;
    public int perimeter;
    public String color;
    public int move;

    public Circle(String color, double cx, double cy, double r){
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public void render(){
        System.out.println("Box("+ this.color + ","+this.cx+ "," + this.cy + "," + this.r +")");
    }

    public double getCenterX() {
        return cx;
    }

    public void setCenterX(double cx) {
        this.cx = cx;
    }

    public double getCenterY() {
        return cy;
    }

    public void setCenterY(double cy) {
        this.cy = cy;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public double area(){
        double are = Math.PI * getRadius() * getRadius();
        return are;
    }
    public double perimeter(){
        double peri = 2*getRadius()*Math.PI;
        return peri;
    }
    public String color(){
        return this.color;
    }
    @Override
    public void move(double a, double b){
        this.cx += a;
        this.cy += b;
    }
    public String getColor(){
        return this.color;
    }

}
class Triangle extends Shape{
    double x1;
    double x2;
    double y1;
    double y2;
    double x3;
    double y3;

    public Triangle(String color, double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x3 = x3;
        this.x2 = x2;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double getCenterX1() {
        return x1;
    }

    public void setCenterX1(double x1) {
        this.x1 = x1;
    }

    public double getCenterX2() {
        return x2;
    }

    public void setCenterX2(double x2) {
        this.x2 = x2;
    }

    public double getCenterY1() {
        return y1;
    }

    public void setCenterY1(double y1) {
        this.y1 = y1;
    }

    public double getCenterY2() {
        return y2;
    }

    public void setCenterY2(double y2) {
        this.y2 = y2;
    }

    public double getCenterX3() {
        return x3;
    }

    public void setCenterX3(double x3) {
        this.x3 = x3;
    }

    public double getCenterY3() {
        return y3;
    }

    public void setCenterY3(double y3) {
        this.y3 = y3;
    }

    public double area(){
        double s1 = Math.sqrt(Math.pow(Math.abs(getCenterX1() - getCenterX2()),2)+ Math.pow(Math.abs(getCenterY1()- getCenterY2()),2));
        double s2 = Math.sqrt(Math.pow(Math.abs(getCenterX1() - getCenterX3()),2)+ Math.pow(Math.abs(getCenterY1()- getCenterY3()),2));
        double s3 = Math.sqrt(Math.pow(Math.abs(getCenterX2() - getCenterX3()),2)+ Math.pow(Math.abs(getCenterY2()- getCenterY3()),2));
        double s = (s1+s2+s3)/2;
        double area = Math.sqrt(s*(s-s1)*(s-2)*(s-s3));
        return s;
    }
   
}



