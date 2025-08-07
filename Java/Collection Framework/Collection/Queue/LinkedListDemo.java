import java.util.*;

public class LinkedListDemo{

    public static void main(String[] args) {
        
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(10); //we can also use add() instead of offer() but if the task is not successfull it will throws  an exception
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println(queue.peek()); //we can also use element() instead of peek() but if the task is not successfull it will throws  an exception


        System.out.println(queue.poll()); //we can also use remove() instead of poll() but if the task is not successfull it will throws  an exception

    }
}