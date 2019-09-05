import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        System.out.println("Enter integer values into the array, or -1 to stop:");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] array = new int[100];
        int k = 0;
        k = sc.nextInt();
        while (k != -1) {
            array[i] = k;
            i++;
            k = sc.nextInt();
        }
        System.out.print("Distinct values in the array: ");
        for(i = 1; i < array.length; i++){
            if(array[i] != array[i-1]){
                System.out.print(array[i-1] + ",");
            }
        }
    }
}
