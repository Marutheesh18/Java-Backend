import java.util.*;

// public class PriorityQueueDemo {
//     public static void main(String[] args) {
        
//         Queue<Integer> pq=new PriorityQueue<>();

//         pq.offer(40);
//         pq.offer(10);
//         pq.offer(20);
//         pq.offer(30);

//         System.out.println(pq);

//         pq.poll(); //The lowest value number will be deleted as its priority is more lets say min heap

//         System.out.println(pq);

//         System.out.println(pq.peek());

//     }
// }





public class PriorityQueueDemo {
    public static void main(String[] args) {
        
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);

        System.out.println(pq);

        pq.poll(); //The highest value number will be deleted as its priority is more lets say max heap

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
