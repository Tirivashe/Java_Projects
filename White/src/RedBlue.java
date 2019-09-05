import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class RedBlue {
    public static final String Purple_Folder = "purple/";
    public static final String Purple_txt = ".txt";
    public static void main (String [] args) throws FileNotFoundException
    {
        StdDraw.setCanvasSize(1200,900);
        if(args.length < 1)
        {
            System.out.println("Usage: java White <REGION>");
            System.exit(-1);
        }

        String voteFile = args[0] + args[1];

        if(args[0].equals("USA-county"))
        {
            Scanner scan_county = new Scanner(new File("purple/" + args[0] + ".txt"));

        }

        Scanner readVote = new Scanner(new File(Purple_Folder + voteFile + Purple_txt));
        String read_region = args[0].substring(0,2);
        readVote.nextLine();

        String [] election = null;
        String election_line = "";
        while(readVote.hasNextLine())
        {
            election_line = readVote.nextLine();
            election = election_line.split(",");
            if(Integer.parseInt(election[1]) > Integer.parseInt(election[2]))
            {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else
            {
                StdDraw.setPenColor(StdDraw.BLUE);
            }

            if(read_region.substring(0,2).equals("US"))
            {
                read_region = "USA";
            }

            Scanner sc = new Scanner(new File(Purple_Folder + read_region + Purple_txt));


            double minX = sc.nextDouble();
            double minY = sc.nextDouble();
            double maxX = sc.nextDouble();
            double maxY = sc.nextDouble();
            StdDraw.setXscale(minX, maxX);
            StdDraw.setYscale(minY, maxY);

            int num_subregions = sc.nextInt();
            for(int i = 0; i < num_subregions; i++)
            {
                String junk = sc.nextLine();
                String blank = sc.nextLine();
                String sub_region_name = sc.nextLine();
                System.out.println(sub_region_name);

                String region = sc.nextLine();
                int num_points = sc.nextInt();
                double x[] = new double[num_points];
                double y[] = new double[num_points];
                for(int j = 0; j < num_points; j++)
                {
                    x[j] = sc.nextDouble();
                    y[j] = sc.nextDouble();
                }

                if(sub_region_name.equals(election[0]))
                {
                    StdDraw.filledPolygon(x, y);
                }
            }
        }
    }
}