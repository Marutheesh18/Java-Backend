
import java.util.Arrays;
import java.util.List;

// public class MethodReference {
//     public static void print(String s){
//         System.out.println(s);
//     }

//     public static void main(String[] args) {
//         List<String> students= Arrays.asList("A","B","C");
//         students.forEach(MethodReference::print);
//     }
// }


public class MethodReference {
    public void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students= Arrays.asList("A","B","C");
        MethodReference mr=new MethodReference();
        students.forEach(mr::print);
    }
}