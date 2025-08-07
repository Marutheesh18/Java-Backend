import java.util.*;

public class CollectionClass {
    
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(10,20,20,50,30,80,70,20);

        System.out.println("Min Element : "+Collections.min(list));

        System.out.println("Max Element : "+Collections.max(list));

        System.out.println(Collections.frequency(list, 20 ));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
