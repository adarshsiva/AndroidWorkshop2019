import java.util.Scanner;
import java.io.FileReader;
public class Demo {
public static void main(String[] args) {
    FileReader file = null;
    try {
        file = new FileReader("luck.txt");
    }catch(Exception c) {}
    Scanner scan = new Scanner(file);
    scan.useDelimiter(",");
    String cn;
    String cc;
    try{while(scan.hasNext()) {
        cn=scan.nextLine();
        cc=scan.nextLine();
        System.out.println(cc);
        System.out.println(cn);}
    }catch(Exception e){}

    }
    
      
}
