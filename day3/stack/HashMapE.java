import java.util.HashMap;
public class HashMapE {
    public static void main(String[] args) {
        HashMap<Integer,String> studentHashMap = new HashMap<>();
        studentHashMap.put(1,"Lucifer Morningstar");
        studentHashMap.put(2,"Chloe");
        studentHashMap.put(3,"Dan");
        studentHashMap.put(4,"Trixie");
        studentHashMap.put(5,"Maze");
        System.out.println(studentHashMap.toString());
       /* studentHashMap.forEach((key,value)-> {
            System.out.println(key+ " "+ value);
        });*/

    }
}