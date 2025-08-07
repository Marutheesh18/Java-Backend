//commonly doing method

// interface Age {
//     int age=22;
//     void printAge();
// }

// class AgeDemo implements Age{

//     public void printAge(){
//         System.out.println(age);
//     }
// }
// public class AnonymousInnerClass {
//     public static void main(String[] args) {
        
//         AgeDemo obj=new AgeDemo();
//         obj.printAge();
//     }
// }


//anonymous inner class example

interface Age {
    int age=22;
    void printAge();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        // A hidden inner class of Age interface is created
        // whose name is not written but an object to it
        // is created.
        
        Age obj=new Age(){
            public void printAge(){
                System.out.println(age);
            }
        };
        obj.printAge();
    }
}