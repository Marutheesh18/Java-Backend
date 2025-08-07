import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<String> animals=new Stack<>();

        animals.push("Dog");
        animals.push("Cat");
        animals.push("Cow");
        animals.push("Horse");

        System.out.println("Stack : " + animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals);

        System.out.println(animals.peek());

    }
}
