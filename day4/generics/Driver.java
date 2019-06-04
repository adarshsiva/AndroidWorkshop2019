public class Driver {
    public static void main(String[] args) {
        Sample<Integer> sample= new Sample<>(121);
        Sample<String> string= new Sample<>("the ride is here");
        Example<String,String> lil=new Example<>("nigh nigh ","guardian angel");
        System.out.println(lil);
        System.out.println(sample);
        System.out.println(string);
    }
}