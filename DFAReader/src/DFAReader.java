import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class DFAReader {
    public static void main(String args[]) throws IOException{
        File file = new File("dfaSample.txt");
        Scanner sc = new Scanner(file);

        String b = sc.next();
        String c[] = b.split(",");
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]);
        }
        int noOfStates = c.length;
        System.out.println(b);
        System.out.println(noOfStates);

    }
}
