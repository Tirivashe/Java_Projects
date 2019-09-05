/**
 * Created by Tirivashe on 3/30/2016.
 */
public class Circle extends Shape {
    public double radius;


    @Override
    public double perimeter(){
        return 2.0 * Math.PI * radius;
    }

    @Override
    public  double computerArea(){
        return 0.0;
    }

}
