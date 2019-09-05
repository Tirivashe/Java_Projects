import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'i' value here: ");
        int input1 = sc.nextInt();
        System.out.print("Enter 'j' value here: ");
        int input2 = sc.nextInt();

        int count1 = 0;
        int count2 = 0;

        while(input1 != 1)
            if(input1 % 2 == 0){input1 = input1 / 2;
            count1++;}
            else{input1 = (3*input1) + 1;
            count1++;}

        while(input2 != 1)
            if(input2 % 2 == 0){input2 = input2 / 2;
                count2++;}
            else{input2 = (3*input2) + 1;
                count2++;}

        System.out.print(input1 + " " + input2+(" ")+ (count1+count2 +2));
        }



}
