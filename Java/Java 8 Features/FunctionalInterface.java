

//without lambda, Drawable implementation using anonymous class  

// interface Drawable{  
//     public void draw();  
// }  
// public class FunctionalInterface {  
//     public static void main(String[] args) {  
  
//         Drawable d=new Drawable(){  
//             public void draw()
//             {
//                 System.out.println("Drawing ");
//             }  
//         };  
//         d.draw();  
//     }  
// }



//without lambda, Drawable implementation using known class 


// interface inter{
//     void m1();
// }

// public class FunctionalInterface implements inter
// {
//     public void m1() {
//         System.out.println("Hello");
//     }

//     public static void main(String[] args) {
//         FunctionalInterface fi=new  FunctionalInterface();
//         fi.m1();
         
//     }
  
// }


interface inter{
    public abstract void m1();
}

public class FunctionalInterface 
{

    public static void main(String[] args) {

        inter i=()->System.out.println("Hi");

        i.m1();


    }

}



// interface inter{
//     public abstract void m1(int a, int b);
// }

// public class FunctionalInterface 
// {

//     public static void main(String[] args) {

//         inter i=(int a , int b)->System.out.println(a+b);

//         i.m1(2,5);


//     }

// }