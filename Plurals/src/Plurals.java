import java.util.Scanner;
public class Plurals {
    public static String PluralForm(String word){
        String user = word;
        String end = "";
        if (word.charAt(word.length()-1) == '.'|| word.charAt(word.length()-1) == '!' || word.charAt(word.length()-1) == '?' || word.charAt(word.length()-1) == ';' || word.charAt(word.length()-1) == ':' || word.charAt(word.length()-1) == ','){
            end = word.charAt(word.length()-1) + "";
            word = word.substring(0,word.length()-1);
        }

        if (word.charAt(word.length()-1) == 's'){
            word += "es";}
        else if (word.charAt(word.length()-1) == 'x'){
            word += "es";}
        else if (word.charAt(word.length()-1) == 'z'){
            word += "es";}
        else if (word.charAt(word.length()-1) =='h' && word.charAt(word.length()-2) == 'c'){
            word += "es";}
        else if (word.charAt(word.length()-1) =='h' && word.charAt(word.length()-2) == 's'){
            word += "es";}
        else if(word.charAt(word.length()-1) =='o' && (word.charAt(word.length()-2) !='a' && word.charAt(word.length()-2) !='e' && word.charAt(word.length()-2) !='i' && word.charAt(word.length()-2) !='o' && word.charAt(word.length()-2) !='u')){
            word += "es";}
        else if (word.charAt(word.length()-1) =='y' && (word.charAt(word.length()-2) !='a' && word.charAt(word.length()-2) !='e' && word.charAt(word.length()-2) !='i' && word.charAt(word.length()-2) !='o' && word.charAt(word.length()-2) !='u')){
            word = word.substring(0,word.length()-1);
            word += "ies";}
        else{
            word += "s";
        }
        return word + end;
    }
    public static void main (String []args){
        System.out.println("This program converts an English word to its plural form.");
        System.out.println();
        System.out.print("English word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print("Plural form: " + PluralForm(word));
    }
}
