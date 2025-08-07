
import java.util.ArrayList;

public class Unboxing {

    public static void main(String[] args) {
        Character ch = 'a';
        char c = ch; //UnBoxing Character Object to Primitive  

        System.out.println(c);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);  
        int num=al.get(0);         // unboxing because get method returns an Integer
        System.err.println(num); 
}
}
