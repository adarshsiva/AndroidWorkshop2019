import java.util.Scanner;
import java.io.FileReader;
public class Sum {
    public static void main(String[] args) {
        FileReader file=null;
        try {
            file = new FileReader("num.txt");
        } catch(Exception e) {}
        Scanner scan = new Scanner(file);
        int c;
        int sum=0;
        int d=0;
        while(scan.hasNext()) {
            c=scan.nextInt();
            sum=sum+c;d++;
        }
        double avg=sum/d;
        System.out.println("sum "+sum);
        System.out.println("avaerage "+avg);
        System.out.println("number of numbers "+d);
    }
}
        