import java.util.Scanner;
import java.io.FileReader;
public class FileRead{
    public static void main(String[] args){
        FileReader file=null;
        try{
            file = new FileReader("in.txt");
        }catch(Exception e){}
        Scanner scan = new Scanner(file);
        int c=scan.nextInt();
        String ch =scan.next();
        scan.nextLine();
        String ch1 =scan.nextLine();
        String ch2 =scan.nextLine();
        System.out.println(c);
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
    }
    }