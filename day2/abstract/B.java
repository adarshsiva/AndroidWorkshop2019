public abstract class B extends A {
    public void saySomething() {
        System.out.println("The "+hi);
    }
    String hello;
    public B() {
        hello="wow";
    }
    abstract void sayHello();
    
}