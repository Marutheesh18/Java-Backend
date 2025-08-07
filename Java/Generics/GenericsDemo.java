//Generics Class

// class Dog<E> {
//     E id;

//     public Dog(E id){
//         this.id=id;
//     }
// }

// public class GenericsDemo {
//     public static void main(String[] args) {
//         Dog d1=new Dog("Rahul"); //If you wont specify data type it will show unchecked warnings
//         Dog<Integer> d2=new Dog<>(12); //cant add int datatype

//         System.out.println(d1.id);
//         System.out.println(d2.id);
//     }
// }



//Generic class with 2 parameters

// class Dog<E,F> {
//     E id;
//     F name;
//     public Dog(E id, F name){
//         this.id=id;
//         this.name=name;
//     }
// }

// public class GenericsDemo {
//     public static void main(String[] args) {
//         Dog<String,String> d1=new Dog<>("Rahul", "Gandhi"); //If you wont specify data type it will show unchecked warnings
//         Dog<Integer,Integer> d2=new Dog<>(12,24); //cant add int datatype
//         Dog<Integer,String> d3=new Dog<>(12,"hui");

//         System.out.println(d1.id+" "+d1.name);
//         System.out.println(d2.id+ " "+d2.name);
//         System.out.println(d3.id+ " "+d3.name);

//     }
// }


// Generics Methods Unbounded (any type of datatypes or objects can be passed)

// public class GenericsDemo {

//     static <E> void printData(E data){
//         System.out.println(data);
//     }



//     public static void main(String[] args) {

//         printData("Nice");
//         printData(10);
//     }
// }


// Generics Methods Bounded


public class GenericsDemo {

    static <E extends Number> void printData(E data){
        System.out.println(data);
    }

    public static void main(String[] args) {

        // printData("Nice"); //You will get error for other datatypes except Number
        printData(10);
    }
}