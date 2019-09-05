import java.util.*;
public class Average {

    public static double mean( double []arr ) {
        double sum = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
        }
        double ave = sum / arr.length;
        return ave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of the array? ");
        int total = sc.nextInt();
        double []numbers = new double[total];   
        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = sc.nextDouble();
        }

        double avg = mean(numbers);
        System.out.printf("The average of these " + numbers.length +" numbers is " + "%.2f",avg);
        System.out.print(".");


    }
}
