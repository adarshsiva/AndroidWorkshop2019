public class Driver {
    public void display(Fruit[] fruits) {
        for(int i=0;i<fruits.length;i++) {
            System.out.println(fruits[i]);
        }
    }
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Round","Green","Watermelon");
        System.out.println(fruit);
        Fruit[] fruits = new Fruit[3];
        fruits[0]= new Fruit("Long","yellow","Banana");
        fruits[1]= fruit;
        fruits[2] = new Fruit("round","red","apple");
        Driver driver=new Driver();
        driver.display(fruits);
    }
}