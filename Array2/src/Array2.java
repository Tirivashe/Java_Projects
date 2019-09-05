import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("How many integers are in your list? ");
        int k = sc.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < a.length; i++){
            System.out.print("Please enter an integer: ");
            int c = sc.nextInt();
            a[i] = c;
            total = total + c;
        }
        for(int j = 0; j < a.length; j ++){
            if(a[j] < 10){
                System.out.println("    "+ a[j]);
            }
            else if(a[j] >= 10 && a[j]< 100){
                System.out.println("   "+ a[j]);
            }
            else if(a[j] >= 100 && a[j]< 1000) {
                System.out.println("  " + a[j]);
            }
            else if(a[j] >= 1000 && a[j]< 100000) {
                System.out.println(" " + a[j]);
            }
            else{
                System.out.println(a[j]);
            }
        }
        System.out.println("-----");
        if(total < 10){
            System.out.println("    "+ total);
        }
        else if(total >= 10 && total < 100){
            System.out.println("   "+ total);
        }
        else if(total >= 100 && total < 1000) {
            System.out.println("  " + total);
        }
        else if(total >= 1000 && total < 100000) {
            System.out.println(" " + total);
        }
        else{
            System.out.println(total);
        }

    }
}
