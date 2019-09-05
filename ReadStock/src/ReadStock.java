import java.util.Scanner;
import java.io.IOException;
import java.net.URL;

public class ReadStock {

    public static String getStockPrice(String symbol){

        String src = readHTML("http://finance.yahoo.com/q?s=" + symbol);
        String lowerSymbol = symbol.toLowerCase();
        int index = src.indexOf("yfs_l84_"+lowerSymbol);
        String stringy = src.substring(index+10,index+30);
        return stringy.substring(stringy.indexOf(">")+1, stringy.indexOf("<")) ;

    }

    public static String getStockName(String symbol){

        String src = readHTML("http://finance.yahoo.com/q?s=" + symbol);
        String lowerSymbol = symbol.toLowerCase();
        int index = src.indexOf("<title>");
        String string = src.substring(index+20,index+60);
        return string.substring(string.indexOf("r")+2,string.indexOf("-"));

    }
    public static String getStockVolume(String symbol){

        String src = readHTML("http://finance.yahoo.com/q?s=" + symbol);
        String lowerSymbol = symbol.toLowerCase();
        int index = src.indexOf("yfs_v53_"+lowerSymbol);

        String stringy = src.substring(index,index+30);
        return stringy.substring(stringy.indexOf(">")+1, stringy.indexOf("<")) ;

    }

    public static String getStockPE(String symbol){

        String src = readHTML("http://finance.yahoo.com/q?s=" + symbol);
        String lowerSymbol = symbol.toLowerCase();
        int index = src.indexOf("<span class=\"small\">(ttm)</span>");
        String stringy = src.substring(index+60,index+75);
        return stringy.substring(stringy.indexOf(">")+1,stringy.indexOf("<"));

    }
    public static String getStockDivYield(String symbol){

        String src = readHTML("http://finance.yahoo.com/q?s=" + symbol);
        String lowerSymbol = symbol.toLowerCase();
        int index = src.indexOf("<th scope=\"row\" width=\"48%\">Div &amp; Yield:</th>");
        String string = src.substring(index+70,index+95);
        return string.substring(string.indexOf(">")+1,string.indexOf("<"));

    }






    public static String readHTML(String site) {
        String contents = "";
        try {
            URL url = new URL(site);
            contents = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Could not open" + site);


        }

        return contents;
    }


    public static void main(String[]args){
        String symbol = args[0];
        System.out.println("Name: " + getStockName(symbol));

        System.out.println("Price: "+ getStockPrice(symbol));

        System.out.println("Volume: " + getStockVolume(symbol));
        System.out.println("P/E: " + getStockPE(symbol));
        System.out.println("Div/Yield: " + getStockDivYield(symbol));




    }
}
