// Predicate is an interface which is present in java.util.function

// interface Predicate<T>
// {
//     public boolean test(Test t);
// }


import java.util.function.Predicate; 

// public class Predicates {
//     public static void main(String[] args) {
        

//         Predicate<Integer> p=I->I>50;
//         Predicate<String> p2=(s)->s.length()>5;

//         System.out.println(p.test(100));
//         System.out.println(p2.test("Namo"));

//     }
// }


public class Predicates {
     static void demo(Predicate<Integer> p, int[] x){
        for(int i : x){
            if(p.test(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        
        int x[]={1,2,3,4,5,6};

        Predicate<Integer> p1=I->I%2==0;
        Predicate<Integer> p2=(I)->I>2;

        System.out.println("Even Numbers");
        demo(p1,x);
        System.out.println("Numbers>2");
        demo(p2, x);
        System.out.println("and method");
        demo(p1.and(p2),x);
        System.out.println("or method");
        demo(p1.or(p2),x);
        System.out.println("negate method");
        demo(p1.negate(),x);
    }
}