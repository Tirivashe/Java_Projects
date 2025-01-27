import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;



public class Start {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        //read the input from the console
        while ((input = br.readLine()) != null && !input.trim().equals("\n") && !input.trim().equals("")) {
            String[] data = input.split("\\s+");

            int numberOfInputs = Integer.parseInt(data[0]);

            if ((data.length - 1) != numberOfInputs) {
                System.out.println("Wrong input. Exiting....");
                System.exit(1);
            }
            BitSet bitSet = new BitSet(numberOfInputs);

            boolean isJolly = true;

            for (int i = 1; i < data.length - 1; i++) {
                int diff = Math.abs(Integer.parseInt(data[i]) - Integer.parseInt(data[i + 1]));
                if (diff < 1 || diff >= numberOfInputs || bitSet.get(diff)) {
                    System.out.println("Not Jolly");
                    isJolly = false;
                    break;
                }
                bitSet.set(diff);
            }
            if (isJolly) {
                System.out.println("Jolly");
            }
        }
    }
}
