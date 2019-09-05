import java.util.Scanner;
public class Anagram {
    public static void main(String []args){
        System.out.println("This program determines if two input strings are anagrams.");
        Scanner sc = new Scanner(System.in);
        System.out.print("#1: ");
        String word1 = sc.nextLine();
        System.out.print("#2: ");
        String word2 = sc.nextLine();
        String str2 = word2;
        String str3 = word1;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        word1 = word1.replaceAll("\\W", "");
        word2 = word2.replaceAll("\\W", "");

        boolean result = false;

        if(word1.length() == word2.length()){
            for(int i = 0; i < word1.length(); i++){
                String str1 = word1.substring(i,i+1);
                word2 = word2.replaceFirst(str1,"");
            }
            if(word2.length() == 0){
                result = true;
            }
            if(result){
                System.out.println("\"" + str3 + "\" is an anagram of \"" +str2 + "\"");
            }
            else{
                System.out.println("\"" + str3 + "\" is not an anagram of \"" + str2 + "\"");
            }
        }
        else{
            System.out.println("\"" + str3 + "\" is not an anagram of \"" + str2 + "\"");
        }
    }
}
 