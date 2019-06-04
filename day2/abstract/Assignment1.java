import java.util.Scanner;
    public class Assignment1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n=scan.nextInt();
        Student[] student = new Student[n];
        int c=0;
        boolean d=true;
        Student temp = new Student();
        for(int i=0;i<n;i++) {
            
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
            }
            finally {
                if(d==true) {
                    student[c]=new Student();
                    student[c] = temp;
                    c++;
                
                }
                   
            }
            
        
        }
        System.out.println(" ");
        System.out.println("The details of the array is:");
        for(int i=0;i<c;i++) {
            System.out.println(" ");
            System.out.println("roll no is "+student[i].rollno+" ");
            System.out.println("name is "+student[i].name+" ");
            System.out.println("class is "+student[i].classs+" ");
            System.out.println("age is "+student[i].age+" ");
        }
    }
}