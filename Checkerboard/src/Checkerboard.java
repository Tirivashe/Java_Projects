
public class Checkerboard {
    public static void main(String[] args) {
        String num = args[0];

        int number = Integer.parseInt(num);
        System.out.println(number +"-by-" + number + " checkerboard:");

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2*number; j++) {
                if(i % 2 != 0){
                    if (j % 2 != 0){
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }else if(i % 2 ==0){
                    if(j % 2 == 0){
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
