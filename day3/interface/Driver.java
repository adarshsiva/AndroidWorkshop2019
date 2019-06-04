public class Driver implements Example,Third,Four {
    public void sayHello() {
        System.out.println("Hello");
    }
    public void saySomething(String c) {
        System.out.println("something "+c);
    }
    
    public void rawSome() {
        System.out.println("kill it");
    }
    public static void main(String[] args) {
        Driver d= new Driver();
        d.sayHello();
        d.saySomething("hi");
        d.rawSome();
    }
}