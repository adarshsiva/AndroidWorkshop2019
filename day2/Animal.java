

public class Animal {
    String says;
    int legs;
    public Animal() {
        says=null;
        legs=0;
    }
    public Animal(String says,int legs) {
        this.says=says;
        this.legs=legs;
    }
    public String getSays() {
        return says;
    }
    public int getLegs() {
        return legs;
    }
    public void setSays(String says) {
        this.says=says;
    }
    public void setLegs(int legs) {
        this.legs=legs;
    }
    public void print() {
        System.out.println(says+" animal "+legs);
    }
}