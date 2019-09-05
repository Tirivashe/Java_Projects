import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args) {
        //Scanner fw = new Scanner(System.in);
        Scanner sw = new Scanner(System.in);


        System.out.print("Please enter the first word: ");
        String firstWord = sw.nextLine();
        System.out.print("Please enter the second word: ");
        String secondWord = sw.nextLine();

        if(firstWord.equals(secondWord)) {
            //System.out.println(firstWord + " is the same as " + secondWord);
        }
        if(firstWord.compareTo(secondWord) < 0){
            System.out.println(firstWord + " is less than " + secondWord + ".");
        }
        else if (firstWord.compareTo(secondWord) == 0){
            System.out.println(firstWord + " is the same as " + secondWord + ".");
        }
        else{
            System.out.println(firstWord + " is greater than " + secondWord+".");
        }

    }
}
