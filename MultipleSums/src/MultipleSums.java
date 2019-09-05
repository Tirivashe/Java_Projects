import java.util.Scanner;

public class MultipleSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int mult3 = 0;
        int mult5 = 0;

        for(int i = 0; i <= limit; i++){
            if(i % 3 == 0){
                mult3 += i;
            }
            else if( i % 5 == 0){
                mult5 += i;
            }
        }
        System.out.print(mult3 + mult5);
    }
}
