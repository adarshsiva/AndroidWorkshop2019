public class Sample {
    public static void main(String[] args) {
    int[] arr = new int[5];
    try {
        arr[5]=6;
    } catch(ArrayIndexOutOfBoundsException e) {
        System.err.println(e);
    }finally {
        System.out.println("Done");
    }
        
    }
}