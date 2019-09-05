public class Box extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private String color;
    private double length = b - a;
    private double width = d -c;

    public Box(String color, double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.color = color;

    }

    public double perimeter(){
        return 2*length*width;
    }

    public String color(){
        return this.color;
    }

    @Override
    public void move(double x, double y){
        this.a += x;
        this.b += y;
    }

    public String getColor(){
        return this.color;
    }

    public void render(){
        System.out.print("Box("+ this.color + ","+this.a+ "," + this.b + "," + this.c + "," + this.d+ ")");
    }

    public double getLeft(){
        return this.a;
    }

    public double setLeft(int a){
        double newLeft = this.getLeft() + a;
        return newLeft;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    @Override
    public double area(){
        return (this.getLength()*this.getWidth());
    }

}