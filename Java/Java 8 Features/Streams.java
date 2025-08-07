import java.util.*;

// Ways To Create Streams

// List<String> list=Arrays.asList("apple" , "banana" , "cherry");
// Stream<String> myStream=list.stream();

// String[] array = {"apple" , "banana" , "cherry"};
// Stream<String> stream=Arrays.stream(array);

// Stream<Integer> intStream= Stream.of(1,2,3,4,5);

// public class Streams {
//     public static void main(String[] args) {
//         List<Integer> l1=Arrays.asList(10,20,30,40,50);
//         System.out.println(l1);


//         List<Integer> collect1 =l1.stream().filter(i->i>30).collect(Collectors.toList());
//         System.out.println(collect1);


//         List<Integer> collect2 =l1.stream().map(i->i+5).collect(Collectors.toList());
//         System.out.println(collect2);


//     }
// }

// public class Streams {
//     public static void main(String[] args) {
      
//      Stream<Integer> intStream= Stream.of(1,2,3,4,25,30,500);
//      List<Integer> filteredList= intStream.filter(x->x%2==0).collect(Collectors.toList());
//      System.out.println(filteredList);

//      int[] array = {1,2,4,5,700};
//      List<Integer> filteredList2=Arrays.stream(array)
//                                      .boxed() // Converts IntStream to Stream<Integer>
//                                      .collect(Collectors.toList());

//      System.out.println(filteredList2);

//       String[] array2 = {"apple" , "banana" , "cherry"};
//      List<String> stream=Arrays.stream(array2).collect(Collectors.toList());
//        System.out.println(stream);
//     }
// }


// public class Streams {
//         public static void main(String[] args) {
//             List<Integer> list=Arrays.asList(1,2,3,5,120,303,4,55,4,10,510,1000);

//             List<Integer> l1=list.stream()
//                                  .filter(x->x%2==0)
//                                  .map(x->x/2)
//                                  .distinct() //removes duplicate
//                                  .sorted((a,b)->b-a) //In Descending Order
//                                  .limit(4) //limits list to to the mentioned size
//                                  .peek(x->System.out.println(x)) //to check the state of list upto this operation
//                                  .skip(1)//skips first n numbers
//                                  .collect(Collectors.toList());
//             System.out.println(l1);                          

//         }
//     }


public class Streams {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,5,120,303,4,55,4,10,510,1000);

        long l1=list.stream()
                             .filter(x->x%2==0)
                             .count(); // returns long 
                            //  .max((a,b)->a-b).get(); //min and max returns optional for answer put long or int or Integer
                            //  .min((a,b)->a-b).get(); 
        System.out.println(l1);                          

    }
}