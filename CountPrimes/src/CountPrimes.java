import java.util.Scanner;
public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println();
        int N = sc.nextInt();
        boolean []isPrime = new boolean[N];
        for(int x = 1; x < N; x++){
            isPrime[x] = true;
        }

        for(int i = 2; i <=N; i++){
            if(isPrime [i-1]){
                System.out.println(i);

                for(int j = i*i; j <= N; j += i){
                    isPrime[j - 1] = false;
                }
            }
        }

    }
}
