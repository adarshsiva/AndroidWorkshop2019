import java.util.Stack;
public class StackE {
    public static void main(String[] args) {
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(12);
        integerStack.push(22);
        integerStack.push(14);
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
    }
}