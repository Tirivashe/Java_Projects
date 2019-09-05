import java.util.Scanner;
public class nSum {
    public static void main(String [] args)
    {
        System.out.print("Enter the dimension: ");
        Scanner sc = new Scanner(System.in);
        int dim = sc.nextInt();
        int array[][] = new int[dim][dim];
        System.out.println("Enter the content of the array");
        for(int i = 0; i < dim; i ++) {
            for(int j = 0; j < dim; j ++)
            {
                int columnSum = sc.nextInt();
                array[i][j] = columnSum;
            }
        }
        int total = 0;
        for(int i = 0; i < dim; i ++)
        {
            total += array[i][0];
            total += array[i][dim - 1];
            if (i > 0 && i < dim-1)
            {
                total += array[i][i];
            }
        }
        System.out.print("The N-sum is "+total);

    }
}
