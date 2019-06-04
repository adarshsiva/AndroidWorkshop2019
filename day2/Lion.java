public class Lion extends Animal {
    boolean hunt;
    public Lion() {
        this.says=null;
        this.legs=0;
        this.hunt=false;
    }
    public Lion(String says,int legs,boolean hunt) {
        this.says=says;
        this.legs=legs;
        this.hunt=hunt;

    }
    public void setHunt(boolean hunt) {
        this.hunt=hunt;
    }
    public boolean getHunt() {
        return hunt;
    }
    public void print() { //overriding
        if(hunt)
            System.out.println(says+"  lion "+ legs);
         else
            System.out.println(says +" lion "+ legs);
    }
    public void print(boolean p) {
        if(p) 
            System.out.println("hunt");
        else    
            System.out.println("no hunt");
    }
    public String toString() {
        if(hunt)
            return says+"  lion "+ legs;
            else    
                return says+"  lion "+ legs;
    }
}