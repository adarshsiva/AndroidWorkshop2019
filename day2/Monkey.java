public class Monkey extends Animal{
    boolean skill;
    public Monkey() {
        says="macaw";
        legs=2;
        skill=false;
    }
    public Monkey(String says,int legs,boolean skill) {
        this.says=says;
        this.legs=legs;
        this.skill=skill;
    }
    public void setSkill(boolean p) {
        this.skill=p;
    }
    public boolean getSkill() {
        return skill;
    }
    public void print(boolean p) {
        if(p)
            System.out.println(says+" ya "+legs);
        else
            System.out.println(says+" na "+legs);
                
                
    }
    public void print() {
        if(skill)
            System.out.println(says+" ya "+legs);
        else
            System.out.println(says+" na "+legs);
                    
                    
    }

    public String toString() {
        if(skill)
            return says+" ya "+legs;
        else    
            return says+" na "+legs;  
    }
}
