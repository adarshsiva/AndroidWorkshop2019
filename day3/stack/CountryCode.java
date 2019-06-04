import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
public class CountryCode {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> countryCodeHashMap = new HashMap<>();
        Scanner scanner = new Scanner(new File("all.csv")); 
        while(scanner.hasNext()) {
            String rowValue = scanner.nextLine();
            System.out.println(rowValue);//quotes csv regex
        }
    }
    
}