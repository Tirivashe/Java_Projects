import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        int first_int;
        int second_int;
        String operation;
        String another;
        int answer = 0;
        //System.out.println("Basic Calculator Program");
        do{
            System.out.println("Basic Calculator Program");
            System.out.print("Enter the first integer: ");
            first_int = si.nextInt();
            System.out.print("Enter the second integer: ");
            second_int = si.nextInt();
            System.out.print("Enter the operator: ");
            operation = si.next();
            if(operation.equals("+")) {
                answer = first_int + second_int;
                System.out.println("The result is: " + answer);
            }
            else if(operation.equals("-")){
                answer = first_int - second_int;
                System.out.println("The result is: " + answer);
            }
            else if(operation.equals("*")){
                answer = first_int * second_int;
                System.out.println("The result is: " + answer);
            }
            else if(operation.equals("/")) {
                if (second_int == 0){
                    System.out.println("Error: cannot divide by zero.");
                }
                else {
                    answer = first_int / second_int;
                    System.out.println("The result is: " + answer);
                }
            }

            else {
                System.out.println("Invalid operation.");
            }

            System.out.print("Another operation (y/n)? ");
            another = si.next();
        }while (another.equals("Y") || another.equals("y") || another.equals("Yes") || another.equals("yes"));

    }

}
