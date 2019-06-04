
 public class Student {
    int rollno;
    String name;
    int classs;
    int age;
    public Student() {
        rollno=0;
        name=null;
        classs=0;
        age=0;
    }
    public Student(int rollno,String name,int classs,int age) {
        this.rollno=rollno;
        this.age=age;
        this.classs=classs;
        this.name=name;
    }
    public int getAge() {
        return age;

    }
    public void check() throws StudentUnderTheAge {
        if(getAge()<18)
        throw new StudentUnderTheAge();
    }
}