import java.util.Scanner;
public class totient{
    public static int totient(int num){
        int count=0;
        for(int a=1;a<num;a++){
            if(GCD(num,a)==1){
                count++;
            }
        }
        return(count);
    }
    public static int GCD(int a, int b){
        int temp;
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        if(a%b==0){
            return(b);
        }
        return(GCD(a%b,b));
    }

    public static void main(String[] args) {
        System.out.print("Enter a positive integer n: ");
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        System.out.print("Phi(n): " + totient(integer));
    }
}
