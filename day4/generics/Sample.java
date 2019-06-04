public class Sample<T> {
    T variable;
    public Sample(T variable) {
        this.variable=variable;
    }
    public String toString() {
        return "the input is:"+variable;
    }
}