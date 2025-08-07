import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        
        Map<String,Integer> numbers=new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 4);


        System.out.println(numbers); //output will be displayed randomly

        // numbers.put("Two", 20); // if the key is same then it will override its value

        numbers.remove("Three");
        
        System.out.println(numbers); 

        numbers.putIfAbsent("Two", 20); //put operation is done only if the the key is not present already in the map

        System.out.println(numbers);

        System.out.println(numbers.containsKey("Three"));

        System.out.println(numbers.containsValue(5));

        System.out.println(numbers.isEmpty());

        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: numbers.keySet()){
            System.out.println(key);
        }

        for(Integer value: numbers.values()){
            System.out.println(value);
        }
    }
}