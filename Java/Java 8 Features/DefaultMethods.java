// interface Animal
// {
//     default void sound(){
//  System.out.println("Bow Bow");
//     }

//     abstract void cat();
// }

// public class DefaultMethods implements Animal{

//     public void cat(){
//       System.out.println("Meow Meow");
//     }
    
//     public static void main(String[] args) {
//         DefaultMethods dm=new DefaultMethods();
//         dm.sound();
//         dm.cat();
//     }
// }


//we can give our own implementation to default methods in implemented class

// interface Animal
// {
//     default void sound(){
//  System.out.println("Bow Bow");
//     }

//     abstract void cat();
// }

// public class DefaultMethods implements Animal{
//       public void sound(){
//         System.out.println("Ambaa Ambaa");
//            }

//     public void cat(){
//       System.out.println("Meow Meow");
//     }
    
//     public static void main(String[] args) {
//         DefaultMethods dm=new DefaultMethods();
//         dm.sound();
//         dm.cat();
//     }
// }


interface Animal {
  default void sound(){
     System.out.println("Bow Bow");
        }
}

interface Bird {
  default void sound(){
    System.out.println("Chew Chew");
  }
}

public class DefaultMethods implements Animal,Bird{
  public void sound(){
    Animal.super.sound();
    Bird.super.sound();
  }

  public static void main(String[] args) {
      DefaultMethods dm = new DefaultMethods();
      dm.sound();
  }
}