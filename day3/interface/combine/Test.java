interface A {
    void say();
}
interface B {
    void sayB();
    void say();
}
abstract class C implements A,B {
    public void sayA() {
        System.out.println("A");
    }
    public void say() {
        System.out.println("say");
    }
    abstract public void sayB();
}
public class Test extends C {
    public void sayB() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        Test d=new Test();
        d.sayA();
        d.say();
        d.sayB();
    }
}