import java.util.Scanner;

public class PrintBio {
    public static void main(String[] args)
    {

        String first_name = args[0];
        String last_name = args[1];
        String age = args[2];
        String Major = args[3];

        System.out.println("------------------------------");

        System.out.println("First name:\t" + first_name);
        System.out.println("Last name:\t" + last_name);
        System.out.println("DOB:\t\t" + age);
        System.out.println("Major:\t\t" + Major);
        System.out.print("------------------------------");
    }
}
