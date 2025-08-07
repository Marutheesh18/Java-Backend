
import java.util.ArrayList;


public class Autoboxing {
    public static void main(String[] args) {
        char ch='a';
        Character c=ch; //AutoBoxing Primitive to Character Object

        System.out.println(c);

        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);  //Autoboxing as Arraylist stores only objects type
        System.out.println(al.get(0));
    }
}
