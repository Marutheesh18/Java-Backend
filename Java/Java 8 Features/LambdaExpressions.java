

// public class LambdaExpressions 
// {

//     // Examples

//     // () -> System.out.println("Hi");

//     // (int a, int b)->{System.out.println("The Sum Is "+ (a+b));}

//     // (int a, int b)->{ return (a+b);}

//     // lambda expressions are used along with interfaces or with for each method

//     public static void main(String[] args) 
//     {
      
//     }
// }


// Examples

interface Sayable{  
    public String say();  
}  
public class LambdaExpressions{  
public static void main(String[] args) 
{  
    Sayable s=()-> {return "Hi";};

    System.out.println(s.say());  

};

}  


// Examples

// interface Sayable{  
//     public int say(int a, int b);  
// }  
// public class LambdaExpressions{  
// public static void main(String[] args) 
// {  
//     Sayable s=(int a, int b)-> {return (a+b);};

//     System.out.println(s.say(2,3));  

// };

// }  

