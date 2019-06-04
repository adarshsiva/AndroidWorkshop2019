public class Fruit { 
    private String shape;
    private String color;
    private String name;
    public Fruit(String fruitShape,String color,String name) {
        shape=fruitShape;
        this.color=color;
        this.name=name;
    }
    public void setShape(String shape) {
        this.shape=shape;
    }
    public String getShape() {
        return this.shape;
    }
    public String toString() {
        return shape+" "+color+" "+name;
    }
}