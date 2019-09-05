import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class White {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Usage: java White <REGION>");
            System.exit(-1);
        }
        Scanner sc = null;
        try {
            File myFile = new File("purple/" + args[0] + ".txt");
            sc = new Scanner(myFile);
        }catch (IOException io){
            System.out.println("Couldn't open the file " + args[0] + ".txt");
            System.exit(-1);
        }

        double minX = sc.nextDouble();
        double minY = sc.nextDouble();
        double maxX = sc.nextDouble();
        double maxY = sc.nextDouble();

        StdDraw.setCanvasSize(1500,1000);
        StdDraw.setXscale(minX, maxX);
        StdDraw.setYscale(minY, maxY);


        int num_subregions = sc.nextInt();
        for (int i = 0; i < num_subregions; i++){
            String junk = sc.nextLine();
            String blank = sc.nextLine();
            String subRegionName = sc.nextLine();

            //have another input that reads the the state and year arguments
            //have for loop that goes through line by line for the blue red


            String region = sc.nextLine();
            int numPoints = sc.nextInt();
            double x[] = new double[numPoints];
            double y[] = new double[numPoints];
            for (int j = 0; j < numPoints; j++){
                x[j] = sc.nextDouble();
                y[j] = sc.nextDouble();
            }
            StdDraw.polygon(x,y);
        }
    }
}
