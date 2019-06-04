public class Driver {
    public static void main(String[] args) {
        Car suzuki = new Car();
        Car honda = new Car("Honda","Red",5); 
        Car tata = new Car("Tata","Orange");
        tata.setColor("Yellow");
        honda.setCompany("BMW");
        suzuki.setnoOfSeats(2);
        String ch = tata.getCompany();
        tata.addSeats(7);
        if(honda.getCompany() == "BMW")
           honda.print();
        System.out.println(ch);
        suzuki.print();
        tata.print();
    }

}