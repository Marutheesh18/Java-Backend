
public class WrapperClass {

    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing: Converting primitives into objects  
        Byte byteObj = b;
        Integer intObj = i;
        Character charObj = c;
        Boolean boolObj = b2;

        System.out.println("Printing Object values");
        System.out.println("Byte object: " + byteObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);


        //Unboxing: Converting Objects to Primitives 
        byte bytevalue = byteObj;
        int intvalue = intObj;
        char charvalue = charObj;
        boolean boolvalue = boolObj;

        System.out.println("Printing Primitive values");
        System.out.println("byte value: "+bytevalue);  
        System.out.println("int value: "+intvalue); 
        System.out.println("char value: "+charvalue);  
        System.out.println("boolean value: "+boolvalue); 

    }
}
