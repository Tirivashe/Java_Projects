import java.lang.Math;
public class Discriminant {
    public static void main(String[] args) {
        String b =(args[0]);
        String c =(args[1]);
        String d =(args[2]);

        double bVal = Double.parseDouble(b);
        double cVal = Double.parseDouble(c);
        double dVal = Double.parseDouble(d);

        //double r = Math.round(bVal*100.00)/100.00;
        /*
        String x = String.format("%.2f",bVal);
        String y = String.format("%.2f",cVal);
        String z = String.format("%.2f",dVal);
        */
        double result = 0.0;
        //double x,y,z;
        result = (bVal*bVal*cVal*cVal) - (4*(cVal*cVal*cVal)) - (4*(bVal*bVal*bVal*dVal)) - (27*(dVal*dVal)) + (18*(bVal*cVal*dVal));
        System.out.printf("The discriminant of the polynomial x^3 + %.2f" +"x^2 + %.2f" + "x + %.2f"+" is %.2f",bVal,cVal,dVal,result);

    }
}
