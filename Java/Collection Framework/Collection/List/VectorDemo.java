import java.util.*;

public class VectorDemo {
    
    public static void main(String[] args) {
        
        List<String> list=new Vector<>();

        list.add("tiger");
        list.add("lion");
        list.add("Dog");
        list.addFirst("rat");

        System.out.println(list);

    }
}
