// public class LocalInnerClass {
   
//     private String greet = "Hello";

//     void display(){

//         class Inner{

//             void say(){
//                 System.out.println(greet);
//             }
//         }

//         Inner obj1=new Inner();
//         obj1.say();

//     }

//    public static void main(String[] args) {
    
//     LocalInnerClass obj2=new LocalInnerClass();
//     obj2.display();

//    }   
// }



//with local variable of Inner class

public class LocalInnerClass {
    
    void display(){

        class Inner{

            private String greet = "Hello";

            void say(){
                System.out.println(greet);
            }
        }

        Inner obj1=new Inner();
        obj1.say();

    }

   public static void main(String[] args) {
    
    LocalInnerClass obj2=new LocalInnerClass();
    obj2.display();

   }   
}