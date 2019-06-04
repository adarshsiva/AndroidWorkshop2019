public class Test1 {
    public static void main(String[] args) {
        String ab="A";
        int c=Integer.parseInt(ab,16);
        System.out.println(c);
        ab="21.5";
        float j=Float.parseFloat(ab);
        System.out.println(j);
        ab="10";
        String bin=Integer.toBinaryString(c);
        System.out.println(bin);
    }
}