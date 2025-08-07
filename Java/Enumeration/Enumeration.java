enum Season {
    WINTER , SUMMER , SPRING, RAINY //we can aslo write enum inside the class 
}

public class Enumeration {
    public static void main(String[] args) {
       
        
        //Traversing or Printing

        Season[] values=Season.values();
        for(Season i:values)
        {
            System.out.println(i);
        }

        //Prints its value

        System.out.println(Season.valueOf("SUMMER"));

        //Prints its index

        System.out.println(Season.SPRING.ordinal());

        //prints same type

        Season s=Season.WINTER;
        System.out.println(s);

        
    }
}
