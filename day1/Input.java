import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
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