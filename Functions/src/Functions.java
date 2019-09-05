public class Functions {
    public static void change(int a){
        a = 0;
        return;
    }

    public static void changeArray(int []arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 5;
                    }
    }

    public static void main(String[] args) {
        int []numbers = {1,2,3,4,5};
        int num = 10;
        System.out.print("BEFORE: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");


        }
        System.out.println();
        changeArray(numbers);

        System.out.print("AFTER: ");
        for(int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
    }
}
