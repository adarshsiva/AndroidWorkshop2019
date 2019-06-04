import java.util.ArrayList;
import java.util.Scanner;
    public class Assignment {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n=scan.nextInt();
        ArrayList<Student> studentList = new ArrayList<>();
        boolean d=true;
        for(int i=0;i<n;i++) {
            Student temp = new Student();
            System.out.println("enter rollno of student "+(i+1));
            temp.rollno=scan.nextInt();
            scan.nextLine();
            System.out.println("enter name of student "+(i+1));
            temp.name=scan.nextLine();
            System.out.println("enter class of student "+(i+1));
            temp.classs=scan.nextInt();
            System.out.println("enter age of student "+(i+1));
            temp.age=scan.nextInt();
            scan.nextLine();
            try {
                temp.check();d=true;
            }catch(Exception e) {d= false;
                System.err.println(e);
            }
            finally {
                if(d==true) {
                    studentList.add(temp);
                
                }
                   
            }
            
        
        }
        System.out.println();
        System.out.println("The details of the array is:");
        System.out.println(studentList);
    }
}