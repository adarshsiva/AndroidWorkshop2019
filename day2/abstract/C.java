public class C extends B{
    
    public void sayHello() {
        System.out.println(hi+" "+hello+" ");
    }
    public static void main(String[] args) {
        C c=new C();
        c.sayHello();
        c.print();
    }

}
