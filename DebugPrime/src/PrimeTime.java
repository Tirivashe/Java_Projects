import java.util.Scanner;

public class PrimeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer from 2 to 288: ");
        int x;
        x = sc.nextInt();

        if (x % 2 == 0 && x % 3 == 0 && x % 5 == 0 && x % 7 == 0 && x % 11 == 0 && x % 13 == 0) {
            System.out.println(x + " is not prime.");
        }
        else if (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13) {
            System.out.println(x + " is prime.");
        }
        else if (x % 2 == 0){
            System.out.println(x + " is not prime.");
        }
        else if (x % 3 == 0) {
            System.out.println(x + " is not prime.");
        }
        else if (x % 7 == 0) {
            System.out.println(x + " is not prime.");
        }
        else if (x % 11 == 0) {
            System.out.println(x + " is not prime.");
        }
        else if (x % 13 == 0) {
            System.out.println(x + " is not prime.");
        }
        else
            System.out.println(x + " is prime.");


    }
}

