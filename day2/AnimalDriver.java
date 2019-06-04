public class AnimalDriver{
    public static void main(String[] args) {
        Animal tiger = new Animal("grrr",4);
        Lion abc = new Lion("roar",4,true);
        Animal lion1=abc; //lion to animal
    lion1.print();    
    System.out.println(abc);
    Monkey def = new Monkey("mong",4,true);
    Monkey lmn=new Monkey();
    System.out.println(def);
    System.out.println(lmn);
    System.out.println("    ");
    lmn.print();
    def.print();
    }
    
}