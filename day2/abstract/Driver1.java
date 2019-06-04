public class Driver1 {
    public static void main(String[] args) {
        Car c=new Car();
        try{
            c.go();
        }catch(Exception e){
                System.err.println(e);
        }
        c.setFuel(0);
        try{
            c.go();
        }catch(Exception e){
                System.err.println(e);
        }
        
    }
}