import java.util.Scanner;
public class Recursion{
    public static int factorial(int n){
        if (n <= 2){
            return 1;
        }

        return n * factorial(n - 1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates factorials.");
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println();
        System.out.println(num + "! = " + factorial(num));

    }
}