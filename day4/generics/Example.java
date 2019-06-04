public class Example<T,G> {
    T variableT;
    G variableG;
    public Example(T variableT,G variableG) {
        this.variableG=variableG;
        this.variableT=variableT;
    }
    public String toString() {
        return "the first input is "+variableT+"and second is "+variableG;
    }
}