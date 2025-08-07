import java.util.*;

public class TreeSetDemo {
     public static void main(String[] args) {
        
        Set<Integer> set=new TreeSet<>();

        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10); //Set does not allow duplicate values

        System.out.println(set); //added orders of values will change according to sorting

        set.remove(20);
        System.out.println(set);

        System.out.println(set.contains(30));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
}

}