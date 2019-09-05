import java.util.Scanner;
public class euler {
    public static int phi(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (GCD(n, i) == 1) {
                count++;
            }
        }
        return (count);
    }

    public static int GCD(int i, int b) {
        int temp;
        if (i < b) {
            temp = i;
            i = b;
            b = temp;
        }
        if (i % b == 0) {
            return (b);
        }
        return (GCD(i % b, b));
    }

    public static void main(String[] args) {
        System.out.print("Enter a positive integer n: ");
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        System.out.print("Phi(n): " + phi(integer));
    }
}


