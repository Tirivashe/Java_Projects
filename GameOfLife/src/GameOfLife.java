import java.util.Scanner;
public class GameOfLife {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Game of Life.");
        System.out.print("How many steps in time? ");
        int time_steps = sc.nextInt();
        System.out.print("What size is the grid? ");
        int grid = sc.nextInt();
        System.out.println("\nEnter the initial grid layout:");
        String[][] cell_grid = new String[grid + 2][grid + 2];
        for(int i = 0; i < grid+2; i++)
        {
            for(int j = 0; j < grid+2; j++)
            {
                cell_grid[i][j] = "-";
            }
        }

        for(int i = 1; i < grid+1; i++)
        {
            String grid_layout = sc.next();   //.split("");
            for(int j = 1; j < grid+1; j++)
            {
                cell_grid[i][j] = "" + grid_layout.charAt(j-1);
            }
        }

        for(int i = 0; i < time_steps; i++)
        {
            String[][] cell_grid2 = new String[grid + 2][grid + 2];
            for(int j = 0; j < grid+2; j++)
            {
                for(int k = 0; k < grid+2; k++)
                {
                    cell_grid2[j][k] = "-";
                }
            }
            for(int j = 1; j < grid + 1; j++)
            {
                for(int k = 1; k < grid + 1; k++)
                {
                    int total = 0;
                    if(cell_grid[j - 1][k].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j - 1][k + 1].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j][k + 1].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j + 1][k + 1].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j + 1][k].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j + 1][k - 1].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j][k - 1].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j - 1][k - 1].equals("O"))
                    {
                        total++;
                    }
                    if(cell_grid[j][k].equals("O") && (total < 2 || total > 3))
                    {
                        cell_grid2[j][k] = "-";
                    }
                    else if(cell_grid[j][k].equals("-") && total == 3)
                    {
                        cell_grid2[j][k] = "O";
                    }
                    else
                    {
                        cell_grid2[j][k] = cell_grid[j][k];
                    }
                }
            }
            cell_grid = cell_grid2;
        }
        System.out.println("\nAfter "+ time_steps +" step(s):");
        for(int i = 1; i < grid + 1; i++)
        {
            for(int j = 1; j < grid + 1; j++)
            {
                System.out.print(cell_grid[i][j]);
            }
            System.out.println("");
        }
    }
}
