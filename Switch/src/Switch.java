import java.util.Scanner;
public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grader;
        System.out.print("Please enter your grade: ");
        grader= sc.nextInt();
        int grade = grader / 10;
        switch (grade){
            case 10:
            case 9:
                System.out.println("A grade of " + grader+ " is an A.");
                break;
            case 8:
                System.out.println("A grade of " + grader+ " is a B.");
                break;
            case 7:
                System.out.println("A grade of " + grader+ " is a C.");
                break;
            case 6:
                System.out.println("A grade of " + grader+ " is a D.");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("A grade of " + grader+ " is an F.");
                break;
            default:
                System.out.println("A grade of " + grader + " is not valid.");

            }
        }


    }


