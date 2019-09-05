import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }

        return  num * factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates factorials");
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("\n");

        System.out.println(number+"! = " + factorial(number));


    }
}
