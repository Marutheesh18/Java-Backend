// public class StaticNestedClass {
    
//     private static int num1=10;
//     static int num2=20;
//     int num3=30;

//    static class Inner {

//         void data(){
//             System.out.println(num1);
//             System.out.println(num2);
//          // System.out.println(num3); cannot access non static variables from static methods
//         }

//     }

//     public static void main(String[] args) {
        
//         StaticNestedClass.Inner obj=new StaticNestedClass.Inner();
//         obj.data();

//     }

// }


//without creating object

public class StaticNestedClass {
    
    private static int num1=10;
    static int num2=20;
    int num3=30;

   static class Inner {

        static void data(){
            System.out.println(num1);
            System.out.println(num2);
         // System.out.println(num3); cannot access non static variables from static methods
        }

    }

    public static void main(String[] args) {
        
        StaticNestedClass.Inner.data();

    }

}