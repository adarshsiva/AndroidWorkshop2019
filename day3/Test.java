public class Test {
    public static void main(String[] args) {
        String ab="56intre5";
        Integer c=0;
        try {
            c=Integer.getInteger(ab);
        }catch(Exception e){}
        
        System.out.println(c);
    }
}