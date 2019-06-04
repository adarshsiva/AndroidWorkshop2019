import java.util.HashMap;
import java.io.FileReader; 
import java.util.Scanner;
public class Assignment {
    
    public static void main(String[] args) {
        FileReader fileName = null;
    try {
        fileName = new FileReader("luck.txt");
    }catch(Exception c) {}
    Scanner scanName = new Scanner(fileName);
    FileReader fileCode=null;
    try {
        fileCode = new FileReader("final.txt");
    }catch(Exception c) {}
    Scanner scanCode = new Scanner(fileCode);
    HashMap<String,String> countryHashMap = new HashMap<>();
    while(scanName.hasNext()) {
       
       countryHashMap.put(scanName.nextLine(),scanName.nextLine());
      
    }
    HashMap<String,String> countryHashMapCode = new HashMap<>();
    while(scanCode.hasNext()) {
       
        countryHashMapCode.put(scanCode.nextLine(),scanCode.nextLine());
       
     }
     Assignment obj=new Assignment();
    System.out.println("Menu");
    System.out.println("1.Find Country Code");
    System.out.println("2.Find Country Name");
    System.out.println("Make your wish");
    Scanner scan=new Scanner(System.in);
    int d=scan.nextInt();
    switch(d) {
        case 1:System.out.println("Enter country name");
                String countryName=scan.next();
                String countryCode=countryHashMap.get(countryName);
                System.out.println(countryCode);
                break;
        case 2:System.out.println("Enter country Code");
                countryCode=scan.next();
                countryName=countryHashMapCode.get(countryCode);  
                System.out.println(countryName); 
                break;  
    }
    }
    }


