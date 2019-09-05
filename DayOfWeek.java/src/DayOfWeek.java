import java.util.Scanner;

public class DayOfWeek{
    public static void main(String[] args) {


        String m1 = (args[0]);
        String d1 = (args[1]);
        String y1 = (args[2]);

        int m = Integer.parseInt(m1);
        int d = Integer.parseInt(d1);
        int y = Integer.parseInt(y1);

        int y0 = y - ((14 - m) / 12);
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7;



        System.out.println(m1+ " " + d1+ " " + y1+ " " + "falls on "+ d0);


    }
}
